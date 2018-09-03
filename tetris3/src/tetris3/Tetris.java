package tetris3;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//UI Frame Board를 화면에 그린다.
public class Tetris extends Frame implements KeyListener{
	//블럭 하나의  크기
	int size=10;
	Board board;
	//Frame의 X좌표시작위치
	int startX=50;
	//Frame의 Y좌표시작위치	
	int startY=50;
	//더블버퍼링을 위한 버퍼 이미지
	Image buffer;
	Graphics bufferg;
	public Tetris(){
		//보드객체를 생성한다
		board=new Board();
		//Frame에 키 리스너 추가
		this.addKeyListener(this);
		//쓰레드로 일정시간 마다 VK.DOWN버튼을 누르게 한다.
		DownThread thread=new DownThread(this);
		thread.start();
	}

    //키 이벤트 발생
	synchronized public void keyPressed(KeyEvent e) {
		keyProcess(e.getKeyCode());
	}

	public void keyProcess(int key){
		//보드에 현재 발생한 이벤트키를 저장한다. 
		board.key=key;
		//보드에 현재 블록을 지운다.
		board.removeBlock(board.block);
		//블럭을 이벤트에 따라 움직인다.
		board.block.move(key);
		//이벤트에 따라 처리된 블럭이 보드에 유효한지 검증하고, 전처리 한다.
		boolean bool=board.preProcess(board.block);
		//전처리된 블럭을 다시 보드에 더한다.
		board.addBlock(board.block);
		//bool=true 는 현재 블럭은 종료되고, 새로운 블록을 생성한다.
		//생성전에 제거된 라인이 있는지 확인하고 있다면 제거한다.
		if(bool){
			board.checkLine();
			board.initBlock();
		}
		//버퍼에 보드를 이미지화 한다.
		drawBuffer();
		//버퍼를 화면에 출력한다.
		repaint();
	}
	private void drawBuffer() {
		//버퍼객체 생성
		buffer=createImage(getWidth(),getHeight());
		bufferg=buffer.getGraphics();
		int x,y;
		//보드에 기록된 배열의 색상을 버퍼에 그린다.
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
    //버퍼의 그림을 실제 Frame에 나타낸다.
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