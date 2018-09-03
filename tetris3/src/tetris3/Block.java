package tetris3;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;

public class Block  implements Cloneable{
	//블럭의 생상
	public static final Color[] colors={Color.blue,Color.CYAN,Color.GRAY,Color.GREEN,Color.ORANGE,Color.PINK,Color.RED};
	//각 블럭의 상수화
	public static final int L_PIECE   = 0;
	public static final int J_PIECE   = 1;
	public static final int I_PIECE   = 2;
	public static final int Z_PIECE   = 3;
	public static final int S_PIECE   = 4;
	public static final int O_PIECE   = 5;
	public static final int T_PIECE   = 6;
    //블럭의 모양(0~6)
	private int type;
	//절대 위치 (보드에서의 위치 [0][0]~[row][col]), 
	Point absolute;
	//상대위치 (절대위치에 더해서 보드에 위치할 좌표를 구한다.)
	Point[] relative;
	//블럭의 색상
	Color color;
	public Block(int type){
		this.type=type;
		absolute=new Point(Board.col/2,0);
		relative=new Point[4];
		color=colors[type];
		init();
	}
	//블럭 타입(0~6)에 따른 상대 위치를 구한다.
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
	//VK_UP에 따른 회전 

	private void rotate()
	{
		for (int count = 0; count < 4; count++) 
		{
			int temp = relative[count].x;

			relative[count].x = -relative[count].y;
			relative[count].y = temp;
		}
	}
	//이벤트에 따라 블럭의 절대 좌표를 구한다.
	//절대좌표만 있으면 상대좌표를 이용해 블럭에서 위치를 알수있다.
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
	//배열의 상대위치를 구한다.
	public Point getRelative(int i) {
		return relative[i];
	}
	//블럭의 정보
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
	//VK_UP버튼 움직임을 되돌린다.(rotate 복귀)
	private void rotateback() {
		for (int count = 0; count < 4; count++) 
		{
			int temp = relative[count].x;

			relative[count].x = relative[count].y;
			relative[count].y = -temp;
		}
		
	}
	

}
