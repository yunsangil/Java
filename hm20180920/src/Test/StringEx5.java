package Test;

import java.util.Scanner;

public class StringEx5 {
//id �Է�
	static String sign = "!@#$%^&*";

	public static void main(String[] args) { //next�� ���ͳ� �����̽� ������ �������� �������� �����.
		Scanner in = new Scanner(System.in);
		System.out.println("���͸� ������ �����մϴ�.");
		in.next();
		
		System.out.println("������");
		String a = in.nextLine();
		System.out.println("�Է� ���� :"+a);
	}
}
