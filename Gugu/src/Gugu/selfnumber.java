package Gugu;

public class selfnumber {

	public static void main(String[] args) {
		int cipherThou, cipherHund, cipherTen, cipherOne, generator;
		int sum = 0;

		int generatorspace[] = new int[5000];
		for (int i = 1; i < 5000; i++) {
			cipherThou = i / 1000;
			cipherHund = (i / 100) % 10;
			cipherTen = (i / 10) % 10;
			cipherOne = i % 10;

			generator = cipherThou + cipherHund + cipherTen + cipherOne + i;

			if (generator < 5000) {
				generatorspace[generator] = 1;
			}
			if (generatorspace[i] == 0) {
				sum += i;
			}
		}
		System.out.println("ÇÕ°è´Â " + sum);
	}

}