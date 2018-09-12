package ArrayEx;

import java.util.Random;

public class ArrayEx3 {
	/*
	 * 1. 배열 종류 : int string boolean
	 * 2. 배열 이름
	 * 3. 배열 길이
	 * 4. 배열의 index와 value
	 */
	public static void main(String[] args) {

		Random r = new Random();
		int [] lotto =new int[7];
		
		for(int j=0;j<5;j++) {
			System.out.println((j+1)+"번째 게임");
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=r.nextInt(45)+1;
			
			for(int k=0;k<i;k++)
			{
				if(lotto[i]==lotto[k])
				{
					i--;
				}
			}

			
		}
		for(int i=0;i<lotto.length;i++)
		{
			System.out.print(i+1+"번째 번호 :"+lotto[i]+" ");
			
		}
		System.out.println();
	}
	}

}
