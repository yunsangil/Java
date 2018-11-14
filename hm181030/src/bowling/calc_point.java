package bowling;

import java.util.Random;
import java.util.Scanner;

class calc_point {
	public static final int pins = 10;
	private int result, result2 = 0, result3 = 0, result4 = 0;

	private Random RBIpins = new Random();
	private Scanner in = new Scanner(System.in);
	private int userrandnum = 0, cpuselect = 0;
	private char[][] countpoint = new char[2][10];
	private int[] savepoint = new int[10];
	private int calcpoint;
	static boolean flag = false;
	static boolean flag2 = false;

	calc_point() {
		bowling();
	}

	void bowling() {
		System.out.println("볼링 게임입니다!");
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("현재 " + (i + 1) + "프레임 째 게임 진행중입니다.");
			if (flag == true) {

				if (flag2 == false) {
					System.out.println("스페어 실패 스트라이크 보너스 10점 + 다음 프레임 1,2구 점수 : " + (20 - (result2 + result4)));
					calcpoint += 10+(pins - (result2 + result4));
					savepoint[i - 1] = calcpoint;

				} else if (flag2 == true) {
					System.out.println("스트라이크 보너스 10점 + 다음 프레임 1,2구 점수 : " + 20);
		
				}
			}
			flag = first_throw();
			if (i<9&&flag2 == true) {
				System.out.println("저번 프레임의 스페어 처리 보너스로 이번 프레임의 1구의 점수가 합산됩니다!");
				System.out.println("스페어 보너스 10점 +이번 프레임 1구 점수 : " + (10 + result2));
				calcpoint += (10 + result2);
				savepoint[i - 1] = calcpoint;
			}

			if (flag == false) {
				System.out.println("남은 핀수는" + result + "개 입니다");
				flag2 = second_throw();
			}
			if(i==9&&flag2==true)
			{
				System.out.println("마지막 프레임 보너스 투구입니다!");
				first_throw();
				System.out.println(result2+"개만큼 쓰러트리셨습니다!");
				calcpoint += 10 + result2;
				savepoint[9] = calcpoint;
			}
			if (flag == true) {
				countpoint[0][i] = 'X';
				countpoint[1][i] = ' ';
				System.out.println("이번 프레임의 스트라이크 처리 보너스로 다음 프레임의 1,2구 점수가 합산됩니다!");
				
			} else {
				countpoint[0][i] = (char) (result2 + 48);
				countpoint[1][i] = (char) (result4 + 48);
				int counttest = countpoint[0][i] + countpoint[1][i];
				if (counttest == 106) {
					countpoint[1][i] = '-';
				} else {

					calcpoint += result2 + result4;
					savepoint[i] = calcpoint;
				}
			}
			for (int j = 0; j < 10; j++) {
				if (countpoint[0][j] > 48 && countpoint[0][j] < 58 || countpoint[0][j] == 88) {
					System.out.print(countpoint[0][j] + "/" + countpoint[1][j] + "|||");
				}
			}
			System.out.println();
			for (int k = 0; k < 10; k++) {

				if (savepoint[k] != 0) {
					System.out.print(" " + savepoint[k] + "|||");
				}
			}
		}
	}

	boolean first_throw() {
		System.out.println("입력 start : 실행");
		String userselect = in.nextLine();
		if (userselect.equals("start")) {

			cpuselect = RBIpins.nextInt(10) + 1; // 1부터 10까지
			userrandnum = RBIpins.nextInt(10) + 1; // 1부터 10까지
			if (cpuselect > userrandnum) {
				result = cpuselect - userrandnum;
			} else if (userrandnum > cpuselect) {
				result = userrandnum - cpuselect;
			}
			if (userrandnum == cpuselect) {
				System.out.println("스트라이크!");
				result = 0;
				result2 = 10;
				return true;
			}
			result2 = pins - result; // result2 -- 쓰러트린 갯수

		} else {
			System.out.println("'start'라고 다시 입력해주세요.");
			first_throw();
		}
		return false;
	}

	boolean second_throw() {
		System.out.println("2구째 입니다. 입력 start : 실행");
		String userselect = in.nextLine();
		if (userselect.equals("start")) {

			cpuselect = RBIpins.nextInt(10) + 1; // 1부터 10까지
			userrandnum = RBIpins.nextInt(10) + 1; // 1부터 10까지
			if (cpuselect > userrandnum) {
				result3 = cpuselect - userrandnum;
			} else if (userrandnum > cpuselect) {
				result3 = userrandnum - cpuselect;
			}
			if (userrandnum == cpuselect) {
				System.out.println("파울!");
				result4 = 0;

			} else {
				if (result3 >= result) {
					System.out.println("스페어처리 성공!");
					result4 = result;
					return true;
				} else {
					System.out.println("스페어 처리 실패!");
					result4 = result - result3;
				}
			}

		} else {
			System.out.println("'start'라고 다시 입력해주세요.");
			second_throw();
		}
		return false;
	}

}
