package practice5;

import java.util.Scanner;

public class practice5 {
public static void main(String[] args)
{
	Scanner rd = new Scanner(System.in);
	int n;
	double sum=0;
	int i=0;
	
	for(n=0;(i=rd.nextInt())!=0;n++)
	{
		sum = sum+ i;
	}
	
	System.out.println("입력된 수의 개수는 "+n+"개 이며 평균은 "+sum/n+"입니다");
}
}
