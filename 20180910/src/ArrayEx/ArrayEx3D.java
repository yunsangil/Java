package ArrayEx;

import java.util.Scanner;
public class ArrayEx3D {
	/*
	 * 3. Ȧ�� �������� ���� ¦�� �������� ����
	 */
	public static void main(String[] args) {
		int [] sort = new int[10];
		int count=0;
		Scanner a = new Scanner(System.in);
		
		for(int i=0;i<sort.length;i++) {
			System.out.println("���ڸ� �Է��ϼ���.");
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
		System.out.println("��� :");
		for(int j=0;j<10;j++)
		{
			System.out.print(sort[j]+"/");
			
			
		}
}
}
