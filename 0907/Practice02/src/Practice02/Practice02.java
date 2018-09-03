package Practice02;

import java.util.Scanner;

public class Practice02 {
	
	public static void main(String args[]){
	
	int count=0;	
		
	Scanner input = new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
	System.out.println("성적을 입력하세요.");
	double 성적 = input.nextDouble();
	
	if(성적<0)
	{
		System.out.println("잘못된 입력입니다.");
		i--;
	}
	if(성적>4.5)
	{
		System.out.println("잘못된 입력입니다.");
		i--;
	}
	
	else if(성적>=4.0)
	{
		System.out.println("A등급입니다."); 
	}
	else if(성적>=3.0)
	{
		System.out.println("B등급입니다");
	}
	else if(성적>=2.0)
	{
		System.out.println("C등급입니다.");
	}
	else if(성적>=1.0)
	{
		System.out.println("D등급입니다.");
	}
	}
	
	}
}
