package hm181101;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		while(true) {
		try {
		System.out.println("입력");
		int i=in.nextInt();
		in.nextLine();
		
		System.out.println("입력값 :" +i);
		}
		catch(Exception e) {
		in.nextLine();
			System.out.println("예외발생");
		}
		}
	}
}
