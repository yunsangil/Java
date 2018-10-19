package ArrayEx;

import java.util.Random;

public class ArrayExEx {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=r.nextInt(45)+1;
			
			for(int a=0;a<i;a++)
			{
				if(lotto[i]==lotto[a])
				{
					i--;
//					break;
				}
			}

		}
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+"/");
		}
	}
}
