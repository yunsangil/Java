package practice01;

import java.util.Scanner;

public class Rectangletest {
	
	int w;
	int h;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		Rectangle test = new Rectangle();
		
		System.out.println("���θ� �Է��ϼ���.");
		test.w = (input.nextInt());
		System.out.println("���θ� �Է��ϼ���.");
		test.h = (input.nextInt());
		
		System.out.println("�Է��� �簢���� ���̴� :"+test.area()+"�Դϴ�");
		System.out.println("�Է��Ͻ� �簢���� �ѷ���:"+test.perimeter()+"�Դϴ�");
	}

}
