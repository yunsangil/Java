package KaKaoStar;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Point {
	private String pointInt = "1234567890";
	
	private GameOne oneGame = null;
	private ArrayList<GameOne> gameAll = new ArrayList<GameOne>(3);
	
	private String gameData = null;
	private Scanner in = new Scanner(System.in);
	
	Point() {
		input();
		prt();
	}
	private void prt() {
		int totalSum = 0;
		for (int i=0; i<gameAll.size(); i++) {
			gameAll.get(i).prt();
			totalSum += gameAll.get(i).cal();
		}
		System.out.println("Total >> " + totalSum);
	}
	private void input() {
		System.out.println("Game Data input >>>");
		gameData = in.nextLine();
		int startPoint = 0;
		int endPoint = 0;
		int gameIndex = 0;
		String setGamePoint = null;
		for(int point = startPoint +1 ; point< gameData.length(); point++) {
			if(searchInt(gameData.charAt(point)) || point == gameData.length() -1) {
				endPoint = point;
				if(point == gameData.length() -1) {
					setGamePoint = gameData.substring(startPoint);
				}
				else {
					setGamePoint = gameData.substring(startPoint, endPoint);
				}
				System.out.println("prt :" + setGamePoint);
				newGameOne(gameIndex++, setGamePoint);
				while( point != gameData.length() -1 && searchInt (gameData.charAt(point +1))) {
					point++;
				}
			}
			startPoint = endPoint;
		}
	}
	private void newGameOne(int thisGame, String setGamePoint) {
		StringTokenizer st = new StringTokenizer(setGamePoint, "SsDdtT*#", true);
		oneGame = new GameOne();
		while(st.hasMoreTokens()) {
			String data = st.nextToken();
			switch(data) {
			case "S":
			case "s":
			case "d":
			case "D":
			case "t":
			case "T":
				oneGame.addOption(data);
				break;
			case "*":
				if(gameAll.size() != 0) {
					System.out.println(thisGame + "/" +gameAll.size());
					gameAll.get(thisGame -1).addOption(data);
				}
			case "#":
				oneGame.addOption(data);
				break;
				default:
					oneGame.setNum(Integer.valueOf(data));
			}
		}
		gameAll.add(oneGame);
	}
	private boolean searchInt(char c) {
		for(int i=0;i<pointInt.length(); i++) {
			if(c == pointInt.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
