package Practice02;

import java.util.Scanner;

public class Practice02 {
	
	public static void main(String args[]){
	
	int count=0;	
		
	Scanner input = new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
	System.out.println("������ �Է��ϼ���.");
	double ���� = input.nextDouble();
	
	if(����<0)
	{
		System.out.println("�߸��� �Է��Դϴ�.");
		i--;
	}
	if(����>4.5)
	{
		System.out.println("�߸��� �Է��Դϴ�.");
		i--;
	}
	
	else if(����>=4.0)
	{
		System.out.println("A����Դϴ�."); 
	}
	else if(����>=3.0)
	{
		System.out.println("B����Դϴ�");
	}
	else if(����>=2.0)
	{
		System.out.println("C����Դϴ�.");
	}
	else if(����>=1.0)
	{
		System.out.println("D����Դϴ�.");
	}
	}
	
	}
}
