package Game;

import java.util.ArrayList;

public class GameRoom {
	//1ȸ���� 4ȸ���� ������ ����
	private static final int maxGame=4;
	GameRun gamerun = new GameRun();
	private ArrayList<GameObj> myGame = new ArrayList<>();
	
	GameRoom(){
		start();
	}
	public void start() {
		for(int startGame = 1; startGame <= maxGame; startGame++) {
			System.out.println(startGame+"ȸ ����! -------------");
			GameObj stGame = gamerun.gameStart();

//			System.out.println(myGame.get(startGame-1).getPoint());
			//myGame�� �� ȸ�� GameObj�� add
			if(myGame.size() !=0) {
				setBonus(stGame.getPoint());	
			}
			myGame.add(stGame);
			pointPrt();
		}
	}
	private void pointPrt() {
		for(int i=0;i<myGame.size();i++) {
			System.out.println((i+1)+" Game Point :"+myGame.get(i).cal());
		}
	}
	private void setBonus(int bonus) {
		if(bonus ==5) {
			
			for(int i=myGame.size()-1; i>myGame.size()-3;i--) {
				if(i<0) {
					break;
				}
				myGame.get(i).addBonus(bonus);				
			}
		}
		else if(bonus ==3) {

			myGame.get(myGame.size()-1).addBonus(bonus);
			
		}
		
	}
}
