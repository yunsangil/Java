package test1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		problem();
	}

	static void problem() {
		String input1 = "a", input2 = "b";
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("ù��° ���� �Է�");
			input1 = in.nextLine();
			int num1 = Integer.valueOf(input1);
			System.out.println("�ι�° ���� �Է�");
			input2 = in.nextLine();
			int num2 = Integer.valueOf(input2);
			System.out.println(num1 + num2);
		} catch (NumberFormatException e) {
			if (input1.equals("x") || input2.equals("x")) {
				System.out.println("����");
				in.close();
				System.exit(0);
			}
			else {
				System.out.println("���ڴ� ��ȯ�� �� ����.");
				problem();
			}
		} finally {
			problem();
		}
	}
}
