package business_log_Document;

import java.util.Scanner;

import business_log_Administration.Handling_business_log;
import business_log_Administration.listOf_business_log;

public class Add_Work_Content {
	Handling_business_log h_b_log = null;
	private Scanner in = new Scanner(System.in);
	private String input_num, input_time, input_content,ContentNum;
	private int input_select, searched_index;
	private boolean flag2 = false;

	public Add_Work_Content(Handling_business_log hl) {
		this.h_b_log = hl; // �ѹ� �����Ѱ� ��� �������� �� ���⿡, Main �޼ҵ忡�� ����� ���� �״�� �����ͼ� ���� ���ؼ�
							// business_log_document�� �����ڴ� Handling_business_log h1�� �������� �ȴ�.
	}

	public void Add_Work_Contents() {
		System.out.println("���� ������ ����ϱ⿡ �ռ�, ���� ��ȣ�� �Է����ּ���.");
		System.out.println("���� ���� ����� ������ �����ϴ�.");
		listOf_business_log.listOf_b_log(h_b_log.create_b_log.b_log);
		flag2 = listOf_business_log.flag;
		if (flag2 == false) {
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
						boolean flag = true;
						while (flag) {
							searched_index = i;
							Work_Content add = new Work_Content();
							System.out.println("����ϰ��� �ϴ� ���������� �ð��� �Է����ּ���.");
							input_time = in.nextLine();
							System.out.println("����ϰ��� �ϴ� ���� ������ �Է����ּ���.");
							input_content = in.nextLine();

							System.out.println("��� �ð� :" + input_time);
							System.out.println("��� ����:" + input_content);
							System.out.println("�� �½��ϱ�?");
							System.out.println("1. �� / 2. �ƴϿ�");
							input_select = in.nextInt();
							in.nextLine();
							if (input_select == 1) {
								add.setTime(input_time);
								add.setContent(input_content);
								System.out.println("���� ������ ����մϴ�.");
								h_b_log.create_b_log.b_log.get(searched_index).WorkContent.add(add);
								System.out.println(h_b_log.create_b_log.b_log.get(i).WorkContent
										.get(h_b_log.create_b_log.b_log.get(i).WorkContent.size() - 1).getContent()
										+ "�� ���� ��ϵǾ����ϴ�!");

								ContentNum = "C"+h_b_log.create_b_log.b_log.get(i).WorkContent.size();
								h_b_log.create_b_log.b_log.get(i).WorkContent
								.get(h_b_log.create_b_log.b_log.get(i).WorkContent.size() - 1).setContentNum(ContentNum);
								
								flag = false;
								break;
							} else if (input_select == 2) {
								System.out.println("�ٽ� ó������ ���ư��ϴ�.");
								break;
							}
						}
					} else if (input_select == 2) {
						System.out.println("�ٽ� ó������ ���ư��ϴ�.");
						Add_Work_Contents();
					}

				} else {
					System.out.println("���� ���� ��ȣ�� �ٽ� �ѹ� Ȯ�����ּ���.");
					return;
				}
			}
		}
	}
}
