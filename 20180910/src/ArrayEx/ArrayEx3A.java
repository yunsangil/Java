package ArrayEx;

import java.util.Random;

public class ArrayEx3A {
	/*
	 * 1. �迭 ���� : int string boolean
	 * 2. �迭 �̸�
	 * 3. �迭 ����
	 * 4. �迭�� index�� value
	 */
	public static void main(String[] args) {
		
		int k,l,m,n;
		int shake;
		int count=0;
		Random r = new Random();
		int [][] lotto =new int[5][7];
		
		for(int j=0;j<5;j++) {
		for(int i=0;i<7;i++)
		{
			lotto[j][i]=r.nextInt(45)+1;
			for(int a=0;a<i;a++)
			{
				if(lotto[j][i]==lotto[j][a])
				{
					i--;
				}
			}
			
		}
		}
		for(k=0;k<5;k++)
		{
			for(l=0;l<5;l++)
			{
				for(m=0;m<7;m++)
				{
					for(n=0;n<7;n++)
					{
						if(lotto[k][m]==lotto[l][n])
						{
//							shake=lotto[k][m];
//							lotto[k][m]=lotto[l][n];
//							lotto[l][n]=shake;
							lotto[k][m]=r.nextInt(45)+1;
						}
					}
				}
			}
		}
		for(int j=0;j<5;j++)
		{
			System.out.println((j+1)+"��° ����");
		for(int i=0;i<7;i++)
		{
			System.out.print(i+1+"��° ��ȣ :"+lotto[j][i]+" ");
			
		}
		System.out.println();
	}

}
}