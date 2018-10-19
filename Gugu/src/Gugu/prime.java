package Gugu;

public class prime {

	public static void main(String[] args) {

		int range = 100;
		int count;
		int prime;
		int index = 0;
		for (int i = 2; i <= range; i++) {
			count = 0;
			prime = 1;
			while (i >= prime) {
				if (i % prime == 0) {
					count += 1;
				}
				prime += 1;
			}
			if (count == 2) {
					System.out.print(i + " ");
				}
			}
		
		System.out.println();

	}

}
