package ArrayEx;

public class Array0913_3 {
	public static void main(String[] args) {

		int[] num = new int[] { 12, 32, 52, 4, 8, 25 };
		// 제일 큰 수를 찾아보자.
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.print("제일 큰 수는 :" + max);
	}
}
