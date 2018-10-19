package ArrayEx;

import java.util.Random;

public class ArrayEx3 {
	/*
	 * 2. 중복 체크
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
