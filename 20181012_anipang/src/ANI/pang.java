package ANI;

import java.util.Random;
import java.util.Scanner;

public class pang {

	static int ArrayAny[][] = new int[7][7];
	static int savenum;
	static int x,y;
	static boolean end = true;

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("현재 배열 상태 :");
		for (int i = 0; i < ArrayAny.length; i++) {
			for (int j = 0; j < ArrayAny[i].length; j++) {
				ArrayAny[i][j] = (i + j) % 4 + 1;
				System.out.print(ArrayAny[i][j] + "/");
			}
			System.out.println();
		}
		while (end) {

			System.out.println("1.실행, 2.종료");
			int startend = in.nextInt();
			in.nextLine();

			if (startend == 1) {

				boolean pang = true;
				System.out.println("좌표 선택");
				x = in.nextInt();
				in.nextLine();
				y = in.nextInt();
				in.nextLine();

				System.out.println("1. 왼쪽 이동? 2. 오른쪽 이동? 3.위로 이동? 4. 아래로 이동?");
				int shift = in.nextInt();
				in.nextLine();

				if (shift == 1 && x != 0) // 충돌방지,왼쪽 1,0
				{
					System.out.println("왼쪽 이동 실행");

					savenum = ArrayAny[x][y];
					ArrayAny[x][y] = ArrayAny[x][y - 1];
					ArrayAny[x][y - 1] = savenum;
				} else if (shift == 2 && x != 6) // 충돌방지,오른쪽 5,0
				{
					System.out.println("오른쪽 이동 실행");
					System.out.println("선택한 좌표의 값" + ArrayAny[x][y] + "가" + ArrayAny[x][y + 1] + "로 이동합니다.");

					savenum = ArrayAny[x][y];
					ArrayAny[x][y] = ArrayAny[x][y + 1];
					ArrayAny[x][y + 1] = savenum;

				} else if (shift == 3 && y != 0) {
					System.out.println("위쪽 이동 실행");

					savenum = ArrayAny[x][y];
					ArrayAny[x][y] = ArrayAny[x - 1][y];
					ArrayAny[x - 1][y] = savenum;
				} else if (shift == 4 && y != 6) {
					System.out.println("아래쪽 이동 실행");

					savenum = ArrayAny[x][y];
					ArrayAny[x][y] = ArrayAny[x + 1][y];
					ArrayAny[x + 1][y] = savenum;
				}
				System.out.println("현재 배열 상태 :");
				for (int i = 0; i < ArrayAny.length; i++) {
					for (int j = 0; j < ArrayAny[i].length; j++) {
						System.out.print(ArrayAny[i][j] + "/");
					}
					System.out.println();
				}
				while (pang) {
					if (x>0&&ArrayAny[x][y] == ArrayAny[x - 1][y]) {
						System.out.println("터집니다");
						ArrayAny[x][y] = r.nextInt(4) + 1;
						ArrayAny[x - 1][y] = r.nextInt(4) + 1;
						x--;
					} else if (ArrayAny[x][y] == ArrayAny[x + 1][y]) {
						System.out.println("터집니다");

						ArrayAny[x][y] = r.nextInt(4) + 1;
						ArrayAny[x + 1][y] = r.nextInt(4) + 1;
						x++;
						}

					else if (y>0&&ArrayAny[x][y] == ArrayAny[x][y - 1]) {
						System.out.println("터집니다");

						ArrayAny[x][y] = r.nextInt(4) + 1;
						ArrayAny[x][y - 1] = r.nextInt(4) + 1;
						y--;
					}

					else if (ArrayAny[x][y] == ArrayAny[x][y + 1]) {
						System.out.println("터집니다");

						ArrayAny[x][y] = r.nextInt(4) + 1;
						ArrayAny[x][y + 1] = r.nextInt(4) + 1;
						y++;
					} else if (x>0&&ArrayAny[x - 1][y] == ArrayAny[x - 1][y + 1]) {
						System.out.println("터집니다");

						ArrayAny[x - 1][y] = r.nextInt(4) + 1;
						ArrayAny[x - 1][y + 1] = r.nextInt(4) + 1;
						x--;
						y++;
					}
//					else if (ArrayAny[x][y - 1] == ArrayAny[x][y - 2]) {
//						System.out.println("터집니다");
//
//						ArrayAny[x][y - 1] = r.nextInt(4) + 1;
//						ArrayAny[x][y - 2] = r.nextInt(4) + 1;
//					}

					else {

						pang = false;
					}
				}

				System.out.println("현재 배열 상태 :");
				for (int i = 0; i < ArrayAny.length; i++) {
					for (int j = 0; j < ArrayAny[i].length; j++) {
						System.out.print(ArrayAny[i][j] + "/");
					}
					System.out.println();
				}
			} else if (startend == 2) {
				end = false;
			}
		}

	}
}
