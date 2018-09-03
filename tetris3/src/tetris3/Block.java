package tetris3;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;

public class Block  implements Cloneable{
	//���� ����
	public static final Color[] colors={Color.blue,Color.CYAN,Color.GRAY,Color.GREEN,Color.ORANGE,Color.PINK,Color.RED};
	//�� ���� ���ȭ
	public static final int L_PIECE   = 0;
	public static final int J_PIECE   = 1;
	public static final int I_PIECE   = 2;
	public static final int Z_PIECE   = 3;
	public static final int S_PIECE   = 4;
	public static final int O_PIECE   = 5;
	public static final int T_PIECE   = 6;
    //���� ���(0~6)
	private int type;
	//���� ��ġ (���忡���� ��ġ [0][0]~[row][col]), 
	Point absolute;
	//�����ġ (������ġ�� ���ؼ� ���忡 ��ġ�� ��ǥ�� ���Ѵ�.)
	Point[] relative;
	//���� ����
	Color color;
	public Block(int type){
		this.type=type;
		absolute=new Point(Board.col/2,0);
		relative=new Point[4];
		color=colors[type];
		init();
	}
	//�� Ÿ��(0~6)�� ���� ��� ��ġ�� ���Ѵ�.
	private void init() {
		switch (type) 
		{
		case I_PIECE : relative[0] = new Point(0, 0);
		relative[1] = new Point(-1, 0);
		relative[2] = new Point(1, 0);
		relative[3] = new Point(2, 0);
		break;

		case L_PIECE : relative[0] = new Point(0, 0);
		relative[1] = new Point(-1, 0);
		relative[2] = new Point(-1, 1);
		relative[3] = new Point(1, 0);
		break;

		case J_PIECE : relative[0] = new Point(0, 0);
		relative[1] = new Point(-1, 0);
		relative[2] = new Point(1, 0);
		relative[3] = new Point(1, 1);
		break;

		case Z_PIECE : relative[0] = new Point(0, 0);
		relative[1] = new Point(-1, 0);
		relative[2] = new Point(0, 1);
		relative[3] = new Point(1, 1);
		break;

		case S_PIECE : relative[0] = new Point(0, 0);
		relative[1] = new Point(1, 0);
		relative[2] = new Point(0, 1);
		relative[3] = new Point(-1, 1);
		break;

		case O_PIECE : relative[0] = new Point(0, 0);
		relative[1] = new Point(0, 1);
		relative[2] = new Point(-1, 0);
		relative[3] = new Point(-1, 1);
		break;

		case T_PIECE : relative[0] = new Point(0, 0);
		relative[1] = new Point(-1, 0);
		relative[2] = new Point(1, 0);
		relative[3] = new Point(0, 1);
		break;
		}

	}
	//VK_UP�� ���� ȸ�� 

	private void rotate()
	{
		for (int count = 0; count < 4; count++) 
		{
			int temp = relative[count].x;

			relative[count].x = -relative[count].y;
			relative[count].y = temp;
		}
	}
	//�̺�Ʈ�� ���� ���� ���� ��ǥ�� ���Ѵ�.
	//������ǥ�� ������ �����ǥ�� �̿��� ������ ��ġ�� �˼��ִ�.
	public void move(int keyCode) {
		switch(keyCode){
		case KeyEvent.VK_LEFT:
			absolute.x--;
			break;
		case KeyEvent.VK_RIGHT:
			absolute.x++;
			break;
		case KeyEvent.VK_DOWN:
			absolute.y++;
			break;
		case KeyEvent.VK_UP:
			rotate();
			break;
		case KeyEvent.VK_X:
			System.exit(0);
			break;

		}
	}
	//�迭�� �����ġ�� ���Ѵ�.
	public Point getRelative(int i) {
		return relative[i];
	}
	//���� ����
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("type ="+type);
		sb.append("\nablsolute x ="+absolute.x+" y="+absolute.y);
		sb.append("\nrelative[0] ="+relative[0].x+" y="+relative[0].y);
		sb.append("\nrelative[1] ="+relative[1].x+" y="+relative[1].y);
		sb.append("\nrelative[2] ="+relative[2].x+" y="+relative[2].y);
		sb.append("\nrelative[3] ="+relative[3].x+" y="+relative[3].y);
		sb.append("\nColor ="+color);
		return sb.toString();
	}
	//
	public void retutnBolck(int keyCode) {
		switch(keyCode){
		case KeyEvent.VK_LEFT:
			absolute.x++;
			break;
		case KeyEvent.VK_RIGHT:
			absolute.x--;
			break;
		case KeyEvent.VK_DOWN:
			absolute.y--;
			break;
		case KeyEvent.VK_UP:
			rotateback();
			break;

		}
		
	}
	//VK_UP��ư �������� �ǵ�����.(rotate ����)
	private void rotateback() {
		for (int count = 0; count < 4; count++) 
		{
			int temp = relative[count].x;

			relative[count].x = relative[count].y;
			relative[count].y = -temp;
		}
		
	}
	

}
