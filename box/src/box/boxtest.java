package box;

import java.util.Scanner;

public class boxtest {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		box box1 = new box();
		box box2 = new box();
		box1.setheight(100);
		box1.setlength(100);
		box1.setwidth(100);
		
		box1.printbox();
		System.out.println("부피는 :"+box1.getVolume());
		
		box2.setheight(200);
		box2.setlength(200);
		box2.setwidth(200);
		
		box2.printbox();
		System.out.println("부피는 : "+box2.getVolume());
		box1.printbox();
		System.out.println("부피는 :"+box1.getVolume());
	}

}
