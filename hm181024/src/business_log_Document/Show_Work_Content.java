package business_log_Document;

import java.util.Scanner;

import business_log_Administration.Handling_business_log;
import business_log_Administration.listOf_business_log;

public class Show_Work_Content {

	Handling_business_log h_b_log = null;
	private Scanner in = new Scanner(System.in);
	private String input_num;
	private int input_select, searched_index;
	private boolean flag = false;

	public Show_Work_Content(Handling_business_log hl) { //Add_Work_Content�� ������ ����ϴ�.
		this.h_b_log = hl;
	}

	public void show() {

		System.out.println("���� ���� ����� ������ �����ϴ�.");
		listOf_business_log.listOf_b_log(h_b_log.create_b_log.b_log);
		flag = listOf_business_log.flag;
		if (flag == false) {
			return;
		} else {
			System.out.println("�������� ��ȣ�� �Է����ּ���.");
			input_num = in.nextLine();

			for (int i = 0; i < h_b_log.create_b_log.b_log.size(); i++) {
				if (input_num.equals(h_b_log.create_b_log.b_log.get(i).getWorkNum())) {
					System.out.println("���� ���� ��ȣ :" + h_b_log.create_b_log.b_log.get(i).getWorkNum());
					System.out.println("������ :" + h_b_log.create_b_log.b_log.get(i).getWork());
					System.out.println("�� �½��ϱ�?");
					System.out.println("1. �� / 2. �ƴϿ�");
					input_select = in.nextInt();
					in.nextLine();

					if (input_select == 1) {
						searched_index = i;
						System.out.println("��ȸ ���� ������ ������ �����ϴ�.");
						for (int k = 0; k < h_b_log.create_b_log.b_log.get(searched_index).WorkContent.size(); k++) {
							System.out.println(
									h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k).toString());

							System.out.println("�߰��� ��ȸ�Ͻ� ���� ���� ��ȣ�� �ֳ���?");
							System.out.println("1.�� / 2.�ƴϿ�");
							input_select = in.nextInt();
							in.nextLine();
							if (input_select == 1) {
								System.out.println("�ٽ� ó������ ���ư��ϴ�.");
								show();
							} else if (input_select == 2) {
								System.out.println("�������� ��ȸ ����");
								break;
							}
						}

					} else if (input_select == 2) {
						System.out.println("�ٽ� ó������ ���ư��ϴ�.");
						show();
					}

				} else {
					System.out.println("���� ���� ��ȣ�� �ٽ� �ѹ� Ȯ�����ּ���.");
					return;
				}
			}
		}
	}
}
