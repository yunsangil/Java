package Game;

import java.util.Random;
import java.util.Scanner;

public class GameRun {
	// 0�ָ�, 1����, 2��
	private int userSign = 0; //
	private int comSign = 0; //
	private int gameCnt = 1; //
	private int point = 0; //
	private static final int maxGame = 2;
	private int[][] resultTable = { { 1, 0, 2 }, { 2, 1, 0 }, { 0, 2, 1 } };
	private int[] pointTable = { 0, 5, 3 };
	private Scanner in = new Scanner(System.in);
	private Random r = new Random();

	GameRun() {
		
	}

	private void init() {
		userSign = 0;
		comSign = 0;
		gameCnt = 1;
		point = 0;
		in = new Scanner(System.in);
	}

	public GameObj gameStart() {
		init();
		while (true) {
			userInput(); // ����ڰ� ����������
			comInput(); // ��ǻ�Ͱ� ����������
			char resultFlag = compare(); // ��

			prt(); // ��� ���
			if (resultFlag == 't' && gameCnt < maxGame) {
				System.out.println("1�� �� ! ");
				gameCnt++;
			} else {
				System.out.println("���� ����");
				
				GameObj nowGame = new GameObj();
				nowGame.setData(userSign, comSign, gameCnt, point);
				return nowGame;
			}
		}
	}

	private void prt() {
		// TODO Auto-generated method stub
		System.out.println("Me : " + changeString(userSign));
		System.out.println("Com : " + changeString(comSign));
		System.out.println("Point :" + point);
	}

	private char compare() {
		// TODO Auto-generated method stub
		if (comSign == resultTable[userSign][0]) {
			System.out.println("�̱�");
			point = pointTable[gameCnt];
			return 'w';
		} else if (comSign == resultTable[userSign][1]) {
			System.out.println("���");
			return 't';
		} else {
			System.out.println("����");
			return 'l';
		}
	}

	private String changeString(int i) {
		switch (i) {
		case 0:
			return "�ָ�";
		case 1:
			return "����";
		case 2:
			return "��";
		}
		return null;
	}

	private void comInput() {
		// TODO Auto-generated method stub
		comSign = r.nextInt(3);
	}

	private void userInput() {
		// TODO Auto-generated method stub
		System.out.println("[" + gameCnt + " game]0�ָ�,1����,2��");
		while (true) {
			try {
				userSign = in.nextInt();
				in.nextLine();
				if (userSign <= 2 && userSign >= 0) {
					break;
				} else {
					System.out.println("0~2������ �Է��ϼ���");
				}
			} catch (Exception e) {
				in.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
//				userInput();
			} 
//			finally {
//				if ((in != null)) {
//					in.close();
//				}
//			}
			System.out.println("�Է°��� : " + userSign);
		}
	}

}
