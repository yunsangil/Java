package Test;

import java.util.Scanner;

public class StringEx3 {

static String sign = "!@#$%^&*";
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("한 글자를 입력하세요");
		char searchChar = in.nextLine().charAt(0);
		boolean flag = searchSign(searchChar);
		System.out.println(searchChar);
		System.out.println(sign.length());
		System.out.println(flag);
		if(flag) {
			System.out.println("특수문자가 포함 되었습니다.");
		}
		else {
			System.out.println("특수문자가 포함되지 않았습니다.");
		}
	}
	
	public static boolean searchSign(char s) {
		//현재 s가 sign에 포함되는지??
		//포함되면 true
		//포함되지 않으면 false

		for(int i=0;i<sign.length();i++)
		{
			if(sign.charAt(i)==s)
			{
				return true;
			}
		}
		return false;
	}

}
