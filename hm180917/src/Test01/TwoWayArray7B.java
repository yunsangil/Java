package Test01;

public class TwoWayArray7B {

	public static void main(String[] args) {
		// 4*6;
		long beginTime = System.currentTimeMillis();


		int[][] house = new int[1000][1000];
		// 건물의 최대 크기인 1000 * 1000 까지 했을 때,
		// 500ms 미만으로 출력되어야 한다.
		boolean trueorfalse = true;
		int days = 0;
		for (int i = 0; i < house.length; i++) {
			for (int j = 0; j < house[i].length; j++) {
				house[i][j] = 0;
			}
		}
		house[house.length - 1][house[0].length - 1] = 1;
		while (trueorfalse) {
			for (int i = house.length-1; i >= 0; i--) {

				for (int j = house[i].length-1; j >= 0; j--) {

					if (house[0][0] == 1) {
						trueorfalse = false;
						break;
					} else if (house[0][j] == 1) {
						house[i][j - 1] = 1;
//						days++;
					} else if (house[i][0] == 1) {
						house[i - 1][j] = 1;
//						days++;
					}

					else if 
					(house[i][j] == 1) {
						house[i][j - 1] = 1;
						house[i - 1][j] = 1;
//						days++;
					}

				}
			}
		}
		for (int i = 0; i < house.length; i++) {
			for (int j = 0; j < house[i].length; j++) {
				System.out.print(house[i][j] + "/");
			}
			System.out.println();
		}
		System.out.println("감염까지 걸리는 시간 :" + days + "일");

		long endTime = System.currentTimeMillis();
		long ms = endTime - beginTime;
		float sec = (float) ms / 1000;
		float min = (float) sec / 60;
		if (min > 1) {
			System.out.println("수행시간 :" + min + "(min)");

		} else if (sec > 1) {
			System.out.println("수행시간 :" + sec + "(sec)");
		} else {
			System.out.println("수행시간 : " + ms + "(ms)");
		}

	}
}