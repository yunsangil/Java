package Test;

import java.util.Scanner;

public class StringEx3 {

static String sign = "!@#$%^&*";
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�� ���ڸ� �Է��ϼ���");
		char searchChar = in.nextLine().charAt(0);
		boolean flag = searchSign(searchChar);
		System.out.println(searchChar);
		System.out.println(sign.length());
		System.out.println(flag);
		if(flag) {
			System.out.println("Ư�����ڰ� ���� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("Ư�����ڰ� ���Ե��� �ʾҽ��ϴ�.");
		}
	}
	
	public static boolean searchSign(char s) {
		//���� s�� sign�� ���ԵǴ���??
		//���ԵǸ� true
		//���Ե��� ������ false

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
