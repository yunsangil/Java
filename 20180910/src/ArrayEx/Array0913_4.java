package ArrayEx;

import java.util.Random;

public class Array0913_4 {
	public static void main(String[] args) {

		int[] num = new int[5];
		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(50) + 1;

			if (num[i] % 2 != 0) {
				i--;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "/");
		}
	}
}
