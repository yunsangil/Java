package practice02;

import java.util.Scanner;

public class Datetest {
	
	int year,month,date;
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		Date test = new Date();
		
		System.out.println("��,��,���� �Է��ϼ���.");
		test.year=input.nextInt();
		test.Month=input.nextInt();
		test.date=input.nextInt();
		
		test.print1();
		test.print2();
		
	}
}
