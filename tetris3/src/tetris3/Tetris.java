package tetris3;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//UI Frame Board�� ȭ�鿡 �׸���.
public class Tetris extends Frame implements KeyListener{
	//�� �ϳ���  ũ��
	int size=10;
	Board board;
	//Frame�� X��ǥ������ġ
	int startX=50;
	//Frame�� Y��ǥ������ġ	
	int startY=50;
	//������۸��� ���� ���� �̹���
	Image buffer;
	Graphics bufferg;
	public Tetris(){
		//���尴ü�� �����Ѵ�
		board=new Board();
		//Frame�� Ű ������ �߰�
		this.addKeyListener(this);
		//������� �����ð� ���� VK.DOWN��ư�� ������ �Ѵ�.
		DownThread thread=new DownThread(this);
		thread.start();
	}

    //Ű �̺�Ʈ �߻�
	synchronized public void keyPressed(KeyEvent e) {
		keyProcess(e.getKeyCode());
	}

	public void keyProcess(int key){
		//���忡 ���� �߻��� �̺�ƮŰ�� �����Ѵ�. 
		board.key=key;
		//���忡 ���� ����� �����.
		board.removeBlock(board.block);
		//���� �̺�Ʈ�� ���� �����δ�.
		board.block.move(key);
		//�̺�Ʈ�� ���� ó���� ���� ���忡 ��ȿ���� �����ϰ�, ��ó�� �Ѵ�.
		boolean bool=board.preProcess(board.block);
		//��ó���� ���� �ٽ� ���忡 ���Ѵ�.
		board.addBlock(board.block);
		//bool=true �� ���� ���� ����ǰ�, ���ο� ����� �����Ѵ�.
		//�������� ���ŵ� ������ �ִ��� Ȯ���ϰ� �ִٸ� �����Ѵ�.
		if(bool){
			board.checkLine();
			board.initBlock();
		}
		//���ۿ� ���带 �̹���ȭ �Ѵ�.
		drawBuffer();
		//���۸� ȭ�鿡 ����Ѵ�.
		repaint();
	}
	private void drawBuffer() {
		//���۰�ü ����
		buffer=createImage(getWidth(),getHeight());
		bufferg=buffer.getGraphics();
		int x,y;
		//���忡 ��ϵ� �迭�� ������ ���ۿ� �׸���.
		for(int i=0;i<board.row;i++){
			for(int j=0;j<board.col;j++){
				x=startX+(j*size);
				y=startY+(i*size);
				bufferg.setColor(board.board[i][j]);
				bufferg.fillRect(x,y,size,size);
			}
		}

	}


	public void update(Graphics g) { 
		paint(g); 
	} 
    //������ �׸��� ���� Frame�� ��Ÿ����.
	public void paint(Graphics g) { 
		g.drawImage(buffer, 0, 0, this); 
	} 



	public void keyReleased(KeyEvent e) {

	}
	public void keyTyped(KeyEvent e) {

	}

	public static void main(String args[]){
		Tetris test=new Tetris();
		test.setBounds(50,50, 300,500);
		test.setVisible(true);
		
	}
	
}