package Test;

import java.util.Scanner;

public class StringEx2 {

	static String sign = "!@#$%^&*";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		sign = "kkk";
		System.out.println(sign);
		a();

//		System.out.println("�� ���ڸ� �Է��ϼ���");
//		char searchChar = in.nextLine().charAt(0);
//		boolean flag = searchSign(searchChar);
//		System.out.println(searchChar);
//		System.out.println(sign.length());
//		System.out.println(flag);
//		if(flag) {
//			System.out.println("Ư�����ڰ� ���� �Ǿ����ϴ�.");
//		}
//		else {
//			System.out.println("Ư�����ڰ� ���Ե��� �ʾҽ��ϴ�.");
//		}
//	}

//	public static boolean searchSign(char s) {
//		//���� s�� sign�� ���ԵǴ���??
//		//���ԵǸ� true
//		//���Ե��� ������ false
////		boolean trueorfalse=true;
////		for(int i=0;i<sign.length();i++)
////		{
////			if(s.equals(sign.charAt(i)))
////			{
////				trueorfalse=true;
////			}
////			else
////			{
////				trueorfalse=false;
////			}
////		}
////		return trueorfalse;
//		for(int i=0;i<sign.length();i++)
//		{
//			if(sign.charAt(i)==s)
//			{
//				return true;
//			}
//		}
//		return false;
//	}

	}
	public static void a() {
		System.out.println(sign);
	}
}
