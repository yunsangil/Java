package ForEx1;
import java.util.Scanner;
import java.util.Random;
public class For14 {

	/*
	 * 1. �迭 ���� : int string boolean
	 * 2. �迭 �̸�
	 * 3. �迭 ����
	 * 4. �迭�� index�� value
	 */
	public static void main(String[] args) {

		Random r = new Random();
		int [] lotto =new int[7];
		
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=r.nextInt(45)+1;
			System.out.println(i+1+"��° ��ȣ :"+lotto[i]);
		}
	}

	}