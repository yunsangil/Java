package Test;

import java.util.Scanner;

public class StringEx4 {
//id �Է�
	static String sign = "!@#$%^&*";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("id�� �Է��ϼ���");
		String id = in.nextLine();
		boolean flag = searchSign(id);
		System.out.println(id);
		System.out.println(flag);
		if (flag) {
			System.out.println("id�� Ư�����ڰ� ���� �Ǿ����ϴ�.");
		} else {
			System.out.println("id�� Ư�����ڰ� ���Ե��� �ʾҽ��ϴ�.");
		}
	}
	public static boolean searchSign(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < sign.length(); j++) {
				if (s.charAt(i) == sign.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
}
