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
			System.out.println("�ӵ��� �ʹ� �����ϴ�. �ӵ��� �����ּ���");
			
			speeddown(input.nextInt());
		}
		else if(speed<=60)
		{
			System.out.println("�ӵ��� �ʹ� �����ϴ�. �ӵ��� �����ּ���.");
			
			speedup(input.nextInt());
		}
		else
		{
			System.out.println("���� �ӵ��� �����ϰ� �ֽ��ϴ�. ���α׷��� �����մϴ�.");
		}
	}
	public void speeddown(int down){
		
		
		speed -= down;

		System.out.println("���� ���� �ӵ���:"+speed+"�Դϴ�");
		
		speedtest();
	}
	public void speedup(int up){
		
		speed += up;

		System.out.println("���� ���� �ӵ���:"+speed+"�Դϴ�");
		
		speedtest();
	}
}
