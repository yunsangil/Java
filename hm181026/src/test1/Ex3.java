package test1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			while (true) {
				try {
					System.out.println("ù��° ���� �Է�");
					String sNum = in.nextLine();
					if (sNum.equals("x"))
						break;
					int num1 = Integer.valueOf(sNum);
					System.out.println("�ι�° ���� �Է�");
					sNum = in.nextLine();
					if (sNum.equals("x"))
						break;
					int num2 = Integer.valueOf(sNum);
					System.out.println(num1 + num2);
				} catch (NumberFormatException e) {
					System.out.println("���ڴ� ��ȯ�� �� �����ϴ�.");
				} catch (Exception e) {

				}
			}
		} finally {
			if (in != null) {
				in.close();
				System.out.println("��������");
			}
		}
	}
}
