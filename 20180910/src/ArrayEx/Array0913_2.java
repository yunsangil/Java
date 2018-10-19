package ArrayEx;

public class Array0913_2 {
	public static void main(String[] args) {

		int[] num = new int[10];
		int cnt = 1;
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (cnt % 2 == 1) {
				num[i - count] = cnt;
			}
			if (cnt % 2 == 0) {
				num[9 - count] = cnt;
				count++;
			}
			cnt++;

		}
		for (int i = 0; i < 10; i++) {

			System.out.print(num[i] + "/");
		}
	}
}
