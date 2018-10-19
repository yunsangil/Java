package Test;

import java.util.Scanner;

public class StringEx5 {
//id 입력
	static String sign = "!@#$%^&*";

	public static void main(String[] args) { //next는 엔터나 스페이스 전까지 가져오고 나머지는 남긴다.
		Scanner in = new Scanner(System.in);
		System.out.println("엔터를 누르면 시작합니다.");
		in.next();
		
		System.out.println("시작중");
		String a = in.nextLine();
		System.out.println("입력 글자 :"+a);
	}
}
