package hm181101;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		while(true) {
		try {
		System.out.println("�Է�");
		int i=in.nextInt();
		in.nextLine();
		
		System.out.println("�Է°� :" +i);
		}
		catch(Exception e) {
		in.nextLine();
			System.out.println("���ܹ߻�");
		}
		}
	}
}
