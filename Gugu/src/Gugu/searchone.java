package Gugu;

public class searchone {
	static int count = 0;

	public static void main(String[] args) {

		int n = 500000;

		for (int i = 1; i <= n; i++) {
			searchOne(i);
			if (i == count && i != 1) {
				System.out.println("f(n)이 같은 경우는 :" + i + "입니다.");
				return;
			}
		}
		System.out.println("1에서" + n + "사이에 존재하는 1의 개수는? " + count);
	}

	public static void searchOne(int num) {
		if (num % 10 == 1)
			count++;
		if (num >= 10)
			searchOne(num / 10);
	}
}