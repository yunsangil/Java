package ForEx1;
import java.util.Scanner;
public class For12 {
	//�� ���
	
	//range = ������ �������? �޴� scanner
	//i = �ټ�
	//j = ��� ��
	//k = ����
	//k_2= ���� 2
	//l = ���� �ټ�
	//m = ���� ��¼�
	//n =���� ����
	//n_2 = ���� ���� 2
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���");
		int range=in.nextInt();
		for(int i=0;i<=range;i++) {
			int num=range/2 - Math.abs(range/2 -i);
			for(int j=0;j<num+(range-2 *num);j++) {
				if (j<num) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}
