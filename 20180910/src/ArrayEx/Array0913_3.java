package ArrayEx;

public class Array0913_3 {
	public static void main(String[] args) {

		int[] num = new int[] { 12, 32, 52, 4, 8, 25 };
		// ���� ū ���� ã�ƺ���.
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.print("���� ū ���� :" + max);
	}
}
