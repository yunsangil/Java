package ForEx1;

public class For1 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.print("-" + i);
				sum -= i;
			} else if (i % 2 == 1) {
				if (i == 1) {
					System.out.print(i);
					sum += i;
				} else {
					System.out.print("+" + i);
					sum += i;
				}
			}
		}
		System.out.print("=" + sum);

	}
}
