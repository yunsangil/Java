package ex1;
import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		//ctrl+shift+0
		
		int num1 = in.nextInt();
		System.out.println(num1);
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");

		int num2 = in.nextInt();
		System.out.println(num2);

		System.out.println("1. ���ϱ�, 2. ����. 3. ���ϱ� ����");
		int sign = in.nextInt();
		if (sign>3);
		{
			System.out.println("�ٽ� �Է��ϼ���");
			System.out.println("1. ���ϱ�, 2. ����. 3. ���ϱ� ����");
			sign = in.nextInt();
		}
		//sign�� ���ؼ� 1�̸� ���� ����, 2�̸� ����, 3�̸� ���� ���� 
		//sum�� ���� �� ����ϵ��� �ۼ�

		int sum=0;
		int subtract=0;
		int multiply=0;
		if(sign==1) {
			sum=num1+num2;
			System.out.println("�� ���� ���� "+sum+" �Դϴ�");
		}
		else if(sign==2) {
			subtract=num1-num2;
			System.out.println("�� ���� ���� "+subtract+" �Դϴ�");
		}
		else if(sign==3) {
			multiply=num1 * num2;
			System.out.println("�� ���� ���� "+multiply+" �Դϴ�");
		}
	}
	
}
