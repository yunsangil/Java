package Test01;

public class TwoWayArray2 {
	public static void main(String[] args) {
		int[][] TwoWayArray = new int[5][7];
		int count = 0;
		int space = 0;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 7; i++) {
				count++;
				TwoWayArray[j][i] = count;

			}

		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 7; i++) {
				for (int k = i + 1; k < 7; k++) {
					if (TwoWayArray[j][i] < TwoWayArray[j][k] && j % 2 == 1) {
						space = TwoWayArray[j][i];
						TwoWayArray[j][i] = TwoWayArray[j][k];
						TwoWayArray[j][k] = space;
					}
				}
			}
		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 7; i++) {
				System.out.print(TwoWayArray[j][i] + "/");
			}
			System.out.println();
		}
	}
}
//배열의 사이즈는 5x7
/*
 * 1. 1 6 11 16 21 26 31 2 7 12 17 22 27 32 3 8 13 18 23 28 33 4 9 14 19 24 29
 * 34 5 10 15 20 25 30 35 행 중심으로
 * 
 * 
 * 
 * 2. 1 2 3 4 5 6 7 14 13 12 11 10 9 8 15 16 17 18 19 20 21 짝수일때 오름차순 홀수일떄 내림차순
 * 
 * 
 * 3. <달팽이> 1 2 3 4 5 6 7 21 22 23 24 25 26 8 20 27 9 ㄱ 19 28 10 ㄴ 모양으로 입력되게끔 18
 * 17 16 15 14 13 12 11
 * 
 * 4. <사선채우기> 1 2 4 7 11 16 21 //1 2 3 4 5 5 3 5 8 12 17 22 26 //2 3 4 5 5 4 6 9
 * 13 18 23 27 30 //3 4 5 5 4 3 10 14 19 24 28 31 33//4 5 5 4 3 2 15 20 25 29 32
 * 34 35//5 5 4 3 2 1
 * 
 * // 배열을 만들어 주는 함수. 배열의 크기 n과 배열을 인자로 받음 void makearr(int n, int (*arr)[n]) {
 * int value = 1; // 배열을 채워 나갈 값 int row = 0, col = -1; // 행(row), 열(col) 을 나타내는
 * index int inc = 1; // index 의 증감량을 나타냄. 1 또는 -1 을 가질 수 있음 int i, j; while (n
 * > 0) { for (i = 0; i < n; i++) {col += inc; // 열 index 를 inc 만큼 증가시킴. inc가
 * -1이면 감소 arr[row][col] = value;value++;}n--; // 전진하는 양 1 감소 if (n == 0) break;
 * // 전진하는 양이 0이 되면 while 루프 빠져나옴 for (i = 0; i < n; i++) {row += inc; // 행
 * index 를 inc 만큼 증가시킴. inc 가 -1이면 감소 arr[row][col] = value;value++;}inc *= -1;
 * //inc 부호바꿈. 증가가 감소로 혹은 감소가 증가로 바뀌는 효과 } }
 * 
 */