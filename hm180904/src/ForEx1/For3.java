package ForEx1;
import java.util.Scanner;
public class For3 {
	//2.if�� �ܵ����� ����Ͽ� Ȧ���� ���ϰ� ¦���� ���� �ϰ� �̋� sum ������ �ϳ��� ���
	//������� �ϳ��� ������ ����
	public static void main(String[] args) {
		

		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		int range = in.nextInt();
		for(int i=1;i<=range;i++) {
			
			if(i%2==0) {				
				
				System.out.print("-"+i);
				sum-=i;
				continue;
			}
				System.out.print("+"+i);

				sum+=i;
		}
		System.out.println("������� :"+sum+"�Դϴ�.");
	}
}
