package ForEx1;
import java.util.Scanner;
public class For13 {
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
		for(int l=1;l<=range;l++) {
			for(int n=0;n<l;n++) {
				System.out.print(" ");
			}
			for(int m=(range*2);m>=(2*l);m--) {
				System.out.print("*");
			}
			System.out.println();
		}
		range=range+1;
		for(int i=1;i<=range;i++) {
			for(int k=range;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<(2*i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	}