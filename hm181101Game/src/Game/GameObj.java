package Game;

import java.util.ArrayList;

//1ȸ ������ �����ϴ� ��ü ����
public class GameObj {
	private int userSign =0;
	private int comSign =0;
	private int gameCnt =0;
	private int point =0;
	private ArrayList<Integer> bonus = new ArrayList<>();
	
	public void setData(int us, int cs, int gc, int point) {
		this.userSign = us;
		this.comSign = cs;
		this.gameCnt = gc;
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	public void addBonus(int b) {
		bonus.add(b);
	}
	public int cal() {
		int sum=point;
		for(int i=0;i<bonus.size();i++) {
			sum += bonus.get(i);
		}
		return sum;
	}
}
