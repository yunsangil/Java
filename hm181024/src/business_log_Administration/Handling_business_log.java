package business_log_Administration;

import java.util.Scanner;

public class Handling_business_log { // ��ü������ business_log_Administration ��Ű����
										// public Ŭ������ Handling_business_log�� �����Ϸ� ������, �ٸ� Ŭ�������� Handling_business_log����
										// ������ �����ڿ�
										// ������ �Ϸ��� �ᱹ ���������� public���� ������ߴ�.

	public create_business_log create_b_log = new create_business_log();
	private delete_business_log delete_b_log = new delete_business_log();
	private update_business_log update_b_log = new update_business_log();
	private Scanner in = new Scanner(System.in);
	private int input_select;

	public void init() {
		boolean flag = true;
		while (flag) {
			menu();
			input_select = in.nextInt();
			switch (input_select) {
			case 1:
				create_b_log.create_logic_inputdate();
				break;
			case 2:
				listOf_business_log.listOf_b_log(create_b_log.b_log); //Ŭ���� �޼ҵ�. �����ڸ� ���� ������ �ʾҴ�.
				break;
			case 3:
				delete_b_log.delete_logic(create_b_log.b_log);
				break;
			case 4:
				update_b_log.update_logic(create_b_log.b_log);
				break;
			case 5:
				System.out.println("�ڷ� ���ϴ�.");
				flag = false;
				break;
			}
		}

	}

	void menu() {
		System.out.println("1. �������� ����");
		System.out.println("2. �������� ���");
		System.out.println("3. �������� ����");
		System.out.println("4. �������� ����");
		System.out.println("5. �ڷ� ����");
	}

}
