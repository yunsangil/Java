package Test;

import java.util.Scanner;

public class StringEx4 {
//id 입력
	static String sign = "!@#$%^&*";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("id를 입력하세요");
		String id = in.nextLine();
		boolean flag = searchSign(id);
		System.out.println(id);
		System.out.println(flag);
		if (flag) {
			System.out.println("id에 특수문자가 포함 되었습니다.");
		} else {
			System.out.println("id에 특수문자가 포함되지 않았습니다.");
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
