package Gugu;

public class searchone {
	static int count = 0;

	public static void main(String[] args) {

		int n = 500000;

		for (int i = 1; i <= n; i++) {
			searchOne(i);
			if (i == count && i != 1) {
				System.out.println("f(n)�� ���� ���� :" + i + "�Դϴ�.");
				return;
			}
		}
		System.out.println("1����" + n + "���̿� �����ϴ� 1�� ������? " + count);
	}

	public static void searchOne(int num) {
		if (num % 10 == 1)
			count++;
		if (num >= 10)
			searchOne(num / 10);
	}
}