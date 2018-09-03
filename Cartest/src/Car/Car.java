package Car;

import java.util.Scanner;

public class Car {
	
	public int speed;
	public int mileage;
	public String color;
	int down,up;
	
	public Car(){
		
		speed = 0;
		mileage = 0;
		color = "white";
	}
	public Car(int s,int m)
	{
		speed = s;
		mileage = m;
	}
	public Car(String c)
	{
		color = c;
	}
	public Car(String c,int s)
	{
		speed = s;
		color = c;
	}
	public Car(int s,int m,String c)
	{
		speed = s;
		color = c;
		mileage = m;
	}
	
	Scanner input = new Scanner(System.in);
	public int speed(Car speed){
		return speed.speed;
		
	}

	
	public void speedtest(){
		
		if(speed>=100)
		{
			System.out.println("속도가 너무 높습니다. 속도를 낮춰주세요");
			
			speeddown(input.nextInt());
		}
		else if(speed<=60)
		{
			System.out.println("속도가 너무 낮습니다. 속도를 높여주세요.");
			
			speedup(input.nextInt());
		}
		else
		{
			System.out.println("적정 속도를 유지하고 있습니다. 프로그램을 종료합니다.");
		}
	}
	public void speeddown(int down){
		
		
		speed -= down;

		System.out.println("현재 차의 속도는:"+speed+"입니다");
		
		speedtest();
	}
	public void speedup(int up){
		
		speed += up;

		System.out.println("현재 차의 속도는:"+speed+"입니다");
		
		speedtest();
	}
}
