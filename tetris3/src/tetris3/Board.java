package tetris3;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;

public class Board {
	//������ ���α���
	public static int row=30;
	//������ ���α���
	public static int col=15;
	//������ ����迭 ����*������ ũ��
	public Color board[][];
	//���忡 ����� ���
	public Block block;
	//���� ������ ����
	public Color bgColor=Color.black;
	//���� ���忡 �߻��� �̺�Ʈ
	int key;
	
	public Board(){
		//���� , ���� ũ�� ��ŭ �迭�� �����ϰ�,
		board=new Color[row][col];
		//�����ʱ�ȭ
		initBoard();
		//�� �ʱ�ȭ
		initBlock();
	}

	public void initBlock() {
		//�������� ���� �ϳ� ����(0~6����)
		int i=(int)(Math.random()*6+1);
		block=new Block(i);
		//���� ���忡 �߰�
		addBlock(block);
		//������ ������ ����
		//System.out.println(block.toString());
	}
	//���� �ʱ�ȭ
	public void initBoard() {
		//�迭ũ�⸸ŭ �������� ���带 �ʱ�ȭ
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				board[i][j]=bgColor;
			}
		}
	}
    //���忡 ������ �� �߰��Ѵ�. (���忡 ���� ��ǥ�� ������ �ش�������� ��ȯ)
	public void addBlock(Block block){
		Point p;
		for(int i=0;i<4;i++){
			p=block.relative[i];
			if(block.absolute.y+p.y>=0)
				board[block.absolute.y+p.y][block.absolute.x+p.x]=block.color;
		}
	}
    //�̺�Ʈ �߻��� ���� ���忡 ��ȿ���� üũ
	public boolean preProcess(Block block) {
		Point p;
		Point ap=block.absolute;
		//���� �� ����(���� ��� 4ĭ�̴�.) üũ
		for(int i=0;i<4;i++){
			p=block.getRelative(i);
			//���� y��ǥ�� ������ row���� ū���
			//���� �عٴڿ��� ��ĭ �� ���������� ���
			//���� ���� �����ϰ� ���� ���� (true ����)
			if(ap.y+p.y>=row){
				System.out.println("�� ����");
				//���� ������ ����
				block.retutnBolck(key);
				return true;
			}
			//���̻� left,right,up�� �ɼ� ���°��� �� ������� ����
			if(ap.x+p.x<0||ap.x+p.x>=col||ap.y+p.y<0){
				System.out.println("���� ���� ����");
				//x�� ���̳ʽ��ų� col���� ū���, y�� ���̳ʽ��� ���´� �� �����ġ�� ����
				block.retutnBolck(key);
				return false;
			}
            //�̵��Ϸ��� ���� �̹� �ٸ� ���� �ִ°��
			if(board[ap.y+p.y][ap.x+p.x]!=bgColor){
				//VK_DOWNŰ�� �̺�Ʈ�� �߻��������� 
				//�ٸ� ���� �ؿ� �ִ°����� VK_DOWN�̺�Ʈ�� �߻��Ͽ��ٸ�
				//���� ���� ����ǰ�, ���� ����(true ����)
				if(key==KeyEvent.VK_DOWN){
					System.out.println("�� ���� �� ����");
					block.retutnBolck(key);
					return true;
				//VK_DOWN�� �ƴ� �ٸ����� ���� ��纹��
				//�̵��Ϸ��� �¿쿡 ���� �ƴ� �ٸ� ���� �ִ°��
				}else{
					block.retutnBolck(key);
					return false;
				}
			}
		}
		//��ó�� �Ҵ���� ���ٸ�, ����� ��� ����
		return false;
	}
    //�� ������ ������ �ƴ� ������ ü���� �ִٸ�, �� ������ �����Ѵ�.
	public void checkLine() {
		System.out.println("���� üũ");
		for(int i=0;i<row;i++){
			int count=0;
			for(int t=0;t<col;t++){
				if(board[i][t]!=bgColor)
					count++;
			}
			if(count==col)
				deleteLine(i);
		}

	}
	//�ش� ������ ���� �������� ü��� ���� ������ �������� ä���.
	private void deleteLine(int n) {
		System.out.println("���� 1�� ����");
		for(int i=n;i>0;i--){
			for(int t=0;t<col;t++){
				board[i][t]=board[i-1][t];
			}
		}
		for(int i=0;i<col;i++){
			board[0][i]=bgColor;
		}

	}
    //���忡�� ���� ���� �����Ѵ�.
	//���� ��ġ�� ������ �������� �����Ѵ�.
	public void removeBlock(Block block){
		Point ap=block.absolute;
		for(int i=0;i<4;i++){
			Point p=block.relative[i];
			board[ap.y+p.y][ap.x+p.x]=bgColor;
		}
	}



}