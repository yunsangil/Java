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
//�迭�� ������� 5x7
/*
 * 1. 1 6 11 16 21 26 31 2 7 12 17 22 27 32 3 8 13 18 23 28 33 4 9 14 19 24 29
 * 34 5 10 15 20 25 30 35 �� �߽�����
 * 
 * 
 * 
 * 2. 1 2 3 4 5 6 7 14 13 12 11 10 9 8 15 16 17 18 19 20 21 ¦���϶� �������� Ȧ���ϋ� ��������
 * 
 * 
 * 3. <������> 1 2 3 4 5 6 7 21 22 23 24 25 26 8 20 27 9 �� 19 28 10 �� ������� �ԷµǰԲ� 18
 * 17 16 15 14 13 12 11
 * 
 * 4. <�缱ä���> 1 2 4 7 11 16 21 //1 2 3 4 5 5 3 5 8 12 17 22 26 //2 3 4 5 5 4 6 9
 * 13 18 23 27 30 //3 4 5 5 4 3 10 14 19 24 28 31 33//4 5 5 4 3 2 15 20 25 29 32
 * 34 35//5 5 4 3 2 1
 * 
 * // �迭�� ����� �ִ� �Լ�. �迭�� ũ�� n�� �迭�� ���ڷ� ���� void makearr(int n, int (*arr)[n]) {
 * int value = 1; // �迭�� ä�� ���� �� int row = 0, col = -1; // ��(row), ��(col) �� ��Ÿ����
 * index int inc = 1; // index �� �������� ��Ÿ��. 1 �Ǵ� -1 �� ���� �� ���� int i, j; while (n
 * > 0) { for (i = 0; i < n; i++) {col += inc; // �� index �� inc ��ŭ ������Ŵ. inc��
 * -1�̸� ���� arr[row][col] = value;value++;}n--; // �����ϴ� �� 1 ���� if (n == 0) break;
 * // �����ϴ� ���� 0�� �Ǹ� while ���� �������� for (i = 0; i < n; i++) {row += inc; // ��
 * index �� inc ��ŭ ������Ŵ. inc �� -1�̸� ���� arr[row][col] = value;value++;}inc *= -1;
 * //inc ��ȣ�ٲ�. ������ ���ҷ� Ȥ�� ���Ұ� ������ �ٲ�� ȿ�� } }
 * 
 */