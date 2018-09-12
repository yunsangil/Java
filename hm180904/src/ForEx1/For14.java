package ForEx1;
import java.util.Scanner;
import java.util.Random;
public class For14 {

	/*
	 * 1. 배열 종류 : int string boolean
	 * 2. 배열 이름
	 * 3. 배열 길이
	 * 4. 배열의 index와 value
	 */
	public static void main(String[] args) {

		Random r = new Random();
		int [] lotto =new int[7];
		
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=r.nextInt(45)+1;
			System.out.println(i+1+"번째 번호 :"+lotto[i]);
		}
	}

	}