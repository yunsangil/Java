package ForEx1;

public class For4 {
	// 3. 100���� 0���� ���ڸ� ���ʴ�� �˻��Ͽ� 
	//99 88 77 ���� ���� �ڸ��� ���� �ڸ��� ���� ���ڸ� ����ϵ� ���� �ڸ��� �˻����� ���ÿ�
	public static void main(String[] args) {

		int dix, units;
		for (int i = 0; i <= 100; i++) {
			dix = i / 10 % 10;
			units = i % 10;

			if (dix == units) {
				if (i == 0 || i == 100) {
					System.out.print("");
				} else {
					System.out.println(i);
				}
			}
		}
	}
}
