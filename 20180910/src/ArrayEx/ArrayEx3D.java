package ArrayEx;

import java.util.Scanner;
public class ArrayEx3D {
	/*
	 * 3. 홀수 오름차순 정렬 짝수 내림차순 정렬
	 */
	public static void main(String[] args) {
		int [] sort = new int[10];
		int count=0;
		Scanner a = new Scanner(System.in);
		
		for(int i=0;i<sort.length;i++) {
			System.out.println("숫자를 입력하세요.");
			int number=a.nextInt();
			
			if(number%2==1)
			{
				sort[i-count]=number;
			}
			
			if(number%2==0)
			{
				sort[sort.length-1-count]=number;
				count++;
			}
		}
		System.out.println("결과 :");
		for(int j=0;j<10;j++)
		{
			System.out.print(sort[j]+"/");
			
			
		}
}
}
