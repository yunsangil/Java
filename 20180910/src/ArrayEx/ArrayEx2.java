package ArrayEx;

import java.util.Random;

public class ArrayEx2 {
	/*
	 * 1. �������� ���� ���� ���� ��
	 * 2. �ߺ� üũ
	 * 3. �������� ����(��������)
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
			System.out.println((j) +":"+lotto[j]+"ȸ");
			if(lotto[j]>=lotto[x]) {
				x = j;
			}
		}
		System.out.print("���� ���� ������ ����"+x+"�̰�,"+lotto[x]+"�� ��� �Ǿ���."+"Ȯ���� "+lotto[x]+"%");
	}

}