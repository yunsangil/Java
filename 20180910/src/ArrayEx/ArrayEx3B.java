package ArrayEx;

import java.util.Random;

public class ArrayEx3B {
	/*
	 * 3. 오름차순 정렬(버블정렬)
	 */
	public static void main(String[] args) {

		int l, m;
		int shake;
		Random r = new Random();
		int[][] lotto = new int[5][7];

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 7; i++) {
				lotto[j][i] = r.nextInt(45) + 1;
				for (int a = 0; a < i; a++) {
					if (lotto[j][i] == lotto[j][a]) {
						i--;
					}
				}

			}
			for (l = 0; l < 7; l++) {
				for (m = l + 1; m < 7; m++) {
					if (lotto[j][l] > lotto[j][m]) {
						shake = lotto[j][l];
						lotto[j][l] = lotto[j][m];
						lotto[j][m] = shake;
					}
				}
			}
		}
		for (int j = 0; j < 5; j++) {
			System.out.println((j + 1) + "번째 게임");
			for (int i = 0; i < 7; i++) {
				System.out.print(i + 1 + "번째 번호 :" + lotto[j][i] + " ");

			}
			System.out.println();
		}
	}
}
