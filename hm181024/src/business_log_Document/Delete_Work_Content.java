package business_log_Document;

import java.util.Scanner;

import business_log_Administration.Handling_business_log;
import business_log_Administration.listOf_business_log;

public class Delete_Work_Content {

	Handling_business_log h_b_log = null;
	private Scanner in = new Scanner(System.in);
	private String input_num, del_CNum;
	private int input_select, searched_index;
	private boolean flag = true;
	private boolean flag2 = false;
	

	public Delete_Work_Content(Handling_business_log hl) {
		this.h_b_log = hl; // �ѹ� �����Ѱ� ��� �������� �� ���⿡, Main �޼ҵ忡�� ����� ���� �״�� �����ͼ� ���� ���ؼ�
							// business_log_document�� �����ڴ� Handling_business_log h1�� �������� �ȴ�.
	}

	public void Delete_Work_Contents() {
		System.out.println("���� ������ �����ϱ⿡ �ռ�, ���� ��ȣ�� �Է����ּ���.");
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
						while (flag) {
							searched_index = i;
							System.out.println("�����ϴ� ������ ���� �����Ǹ�, ������ �Ұ����մϴ�.");
							System.out.println("������ �����Ͻðڽ��ϱ�?");
							System.out.println("1. �� / 2. �ƴϿ�");
							input_select = in.nextInt();
							in.nextLine();
							if (input_select == 1) {

								System.out.println("���� ����� ���� ������ ������ �����ϴ�.");

									System.out.println(h_b_log.create_b_log.b_log.get(searched_index).WorkContent.toString());
								System.out.println("�����Ϸ��� �ϴ� ���� ���� ��ȣ�� �Է����ּ���.");
								del_CNum = in.nextLine();
								for (int k = 0; k < h_b_log.create_b_log.b_log.get(searched_index).WorkContent
										.size(); k++) {
									if (del_CNum.equals(h_b_log.create_b_log.b_log.get(searched_index).WorkContent
											.get(k).getContentNum())) {
										System.out.println(
												h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k));
										System.out.println("�� �����Ǿ����ϴ�.");
										h_b_log.create_b_log.b_log.get(searched_index).WorkContent.remove(k);
										return;
									}

								}

							} else if (input_select == 2) {
								System.out.println("�ٽ� ó������ ���ư��ϴ�.");
								break;
							}
						}
					} else if (input_select == 2) {
						System.out.println("�ٽ� ó������ ���ư��ϴ�.");
						Delete_Work_Contents();
					}

				} else {
					System.out.println("���� ���� ��ȣ�� �ٽ� �ѹ� Ȯ�����ּ���.");
					return;
				}
			}
		}
	}
}
