package hm20181010_stack;

import java.util.Scanner;

public class Stack {
	
	static int index=0;
	static int size=10;
	static String Stack[] = new String[size];
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
	}
	public void push(String value)
	{
		if(index>=size)
		{
			System.out.println("사이즈를 초과합니다.");
			return;
		}
		else
		{
			Stack[index]=value;
			index++;
		}
	}
	public void pop()
	{
		if(index==-1)
		{
			System.out.println("스택이 비었습니다.");
		}
		else
		{
			System.out.println("pop된 값은"+Stack[index]);
			Stack[index]=null;
			index--;
		}
	}
	public void Stacklist()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(i+"번방의 값:"+Stack[i]);
		}
	}
}
