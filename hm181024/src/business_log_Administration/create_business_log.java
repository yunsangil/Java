package business_log_Administration;

import java.util.ArrayList;
import java.util.Scanner;

public class create_business_log {
	public ArrayList<business_log> b_log = new ArrayList<>();
	private Scanner in = new Scanner(System.in);
	private int input_year, input_month, input_day, input_select, limit_date; // �ַ� �Է��̳�, ��꿡 Ȱ��Ǵ� ����
	private String WorkNum; // �۾���ȣ

	private String input_work;

	void create_logic_inputdate() {
		System.out.println("���� ��¥�� �Է����ּ���. (-�� ���� �Է��ؾ��մϴ�. ex]18 10 24)");
		input_year = in.nextInt();
		input_month = in.nextInt();
		input_day = in.nextInt(); // ����� ������ �ְ� ���޾� �Է��� �ص� �� ������ ������ �Ǽ� �Է��� �ȴ�.
		in.nextLine();
		if (input_month > 12 || input_day > 30) {
			System.out.println("��¥�� ����� �Է����ּ���!");
		} else {
			business_log add = new business_log(input_year, input_month, input_day);
			System.out.println("���� �Է��Ͻ� ��¥��" + add + "�Դϴ�. �½��ϱ�?"); // business_log�� �⺻ toString�� year,month,day�� ��ȯ�ϹǷ�
																	// ��밡��
			System.out.println("1. �� / 2.�ƴϿ� / 3.����");
			input_select = in.nextInt();
			in.nextLine();
			if (input_select == 1) {
				boolean flag = true;
				while (flag) {
					System.out.println("� ������ ����Ͻðڽ��ϱ�?");
					input_work = in.nextLine();

					System.out.println("����� ������ ������ ��Ȯ�� �մϴ�.");
					System.out.println(input_work);
					System.out.println("������ �½��ϱ�?");
					System.out.println("1. �� / 2. �ƴϿ�");
					input_select = in.nextInt();
					in.nextLine();
					if (input_select == 1) {

						boolean flag2 = true;
						while (flag2) {
							System.out.println("���� ���ڸ� �Է����ּ���. (-�� ���� �Է��ؾ��մϴ�. ex]18 10 25)");
							input_year = in.nextInt();
							input_month = in.nextInt();
							input_day = in.nextInt();
							if (input_month > 12 || input_day > 30) {
								System.out.println("��¥�� ����� �Է����ּ���!");
							} else {
								add.setLimit_year(input_year); // business_log���Ͽ��� ������ ������ setter�� ���� �ִ� ������ ���� ����� �̷���
																// ������ �� �ۿ� ���� �����̴�.
								add.setLimit_month(input_month);
								add.setLimit_day(input_day);

								System.out.println("�ش� ������ ����մϴ�.");
								add.setWork(input_work);
								b_log.add(add);
								WorkNum = "W" + b_log.size();
								b_log.get(b_log.size() - 1).setWorkNum(WorkNum);

								System.out.println(
										add + "�� " + "���� ��ȣ : " + WorkNum + "������ : " + add.getWork() + "�� ���� ��ϵǾ����ϴ�!");
								limit_date = (add.getLimit_year() * 365 + add.getLimit_month() * 30
										+ add.getLimit_day())
										- (add.getLog_year() * 365 + add.getLog_month() * 30 + add.getLog_day());
								System.out.println("�������� " + add.toString2() + "�̰�, ������ �������� ���� �ϼ���" + limit_date
										+ "�� �Դϴ�. �������ּ���!");

								flag = false; // ���� Ż��
								flag2 = false;
							}
						}
					} else if (input_select == 2) {
						System.out.println("�ٽ� ó������ ���ư��ϴ�.");
						System.out.println("����Ͻ÷��� 1����, �������� ���� �ߴ��� ���Ͻø� 2�� �Է����ּ���.");
						input_select = in.nextInt();
						in.nextLine();
						if (input_select == 2) {
							System.out.println("�ߴܵ˴ϴ�.");
							return; // Ŭ���� ����
						}

					}
				}
			} else if (input_select == 2) { // ���ȣ��
				System.out.println("�ٽ� ó������ ���ư��ϴ�.");
				create_logic_inputdate();
			} else if (input_select == 3) // ó�� ��¥ �Է� �� 3�� �Է����� ��
			{
				System.out.println("�����մϴ�.");
				return;
			}

		}
	}

}
