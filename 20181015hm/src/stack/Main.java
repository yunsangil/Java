package stack;

public class Main {

	static int[][] house = new int[5][5];
	static int days = 0;

	public static void main(String[] args) {

		boolean trueorfalse = true;
		for (int i = 0; i < house.length; i++) {
			for (int j = 0; j < house[i].length; j++) {
				house[i][j] = 1;
			}
		}
		house[1][1] = -1;
		house[1][3] = -1;
		house[3][0] = -1;
		house[3][2] = -1;
		house[3][3] = -1;
		house[house.length - 1][house[0].length - 1] = 4;

		printnow();
		while (trueorfalse) {
			for (int i = 0; i < house.length; i++) {
				for (int j = 0; j < house[i].length; j++) {

					if (house[0][0] == 4) {
						trueorfalse = false;
						break;
					}

					else if (house[i][j] == 4) {
						if (i > 0 && j > 0) {
							if (house[i - 1][j] == -1) {
								house[i - 1][j] = -1;
								house[i][j - 1] = 4;
							} else if (house[i][j - 1] == -1) {
								house[i - 1][j] = 4;
								house[i][j - 1] = -1;
							} 
//							else if (house[i - 1][j] == -1 && house[i][j - 1] == -1) {
//								house[i - 1][j] = -1;
//								house[i][j - 1] = -1;
//							} 
						else {
								house[i][j - 1] = 4;
								house[i - 1][j] = 4;
							}
						} else if (i == 0) {
							if (house[i][j - 1] == -1) {
								continue;
							}

							else if (house[i][j] == 4) {
								house[i][j - 1] = 4;
							}
						} else if (j == 0) {
							if (house[i - 1][j] == -1) {
								continue;
							} else if (house[i][j] == 4) {
								house[i - 1][j] = 4;
							}
						}
					}
				}
			}
			days++;
			printnow();
		}
		System.out.println("감염까지 걸리는 시간 :" + days + "일");
	}

	public static void printnow() {
		System.out.println(days + "일차 감염상황");

		for (int i = 0; i < house.length; i++) {
			for (int j = 0; j < house[i].length; j++) {
				System.out.print(house[i][j] + "/");
			}
			System.out.println();
		}
	}
}
