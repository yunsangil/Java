package practice01;

import java.util.Scanner;

public class Rectangletest {
	
	int w;
	int h;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		Rectangle test = new Rectangle();
		
		System.out.println("가로를 입력하세요.");
		test.w = (input.nextInt());
		System.out.println("세로를 입력하세요.");
		test.h = (input.nextInt());
		
		System.out.println("입력한 사각형의 넓이는 :"+test.area()+"입니다");
		System.out.println("입력하신 사각형의 둘레는:"+test.perimeter()+"입니다");
	}

}
