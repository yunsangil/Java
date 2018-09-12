package ArrayEx;

import java.util.Random;

public class ArrayEx2A {
	/*
	 * 1. 배열 종류 : int string boolean
	 * 2. 배열 이름
	 * 3. 배열 길이
	 * 4. 배열의 index와 value
	 */
	public static void main(String[] args) {
		
		int x=1;
		double y=0;

		Random r = new Random();
		int [] lotto =new int[46];
		for(int i=0;i<100;i++)
		{ //1~45
			lotto[r.nextInt(45)+1% 46]++;
		}
		for(int j=1;j<46;j++) {
			System.out.println((j) +":"+lotto[j]+"회");
			if(lotto[j]>lotto[x]) {
				x = j;
			}
		}
		System.out.print("가장 많이 생성된 수는"+x+"이고,"+lotto[x]+"번 출력 되었다."+"확률은 "+lotto[x]+"%");
	}

}
