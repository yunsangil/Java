package business_log_Administration;

import java.util.ArrayList;
import java.util.Scanner;

class delete_business_log { //delete�� �߿��� ����̹Ƿ�, ���� ������ ���� ���� ���� ��Ű�� ������ ó���ߴ�.

	private String del_worknum;
	private int input_select, searched_index;
	private Scanner in = new Scanner(System.in);
	private boolean flag2 = false;

	void delete_logic(ArrayList<business_log> b_log) {
		boolean flag = true;
		while (flag) {
			System.out.println("�������� ���� �޴��Դϴ�. list�� �ҷ��ɴϴ�.");
			listOf_business_log.listOf_b_log(b_log);
			flag2 = listOf_business_log.flag;
			if (flag2 == false) {
				flag=false;
			} else {
				System.out.println("���� ��ȣ�� ������� ������ �����մϴ�. �����Ͻ� ���� ��ȣ�� �Է����ּ���.");
				del_worknum = in.nextLine();

				for (int i = 0; i < b_log.size(); i++) {
					if (del_worknum.equals(b_log.get(i).getWorkNum())) {
						System.out.println("������ ������ :" + b_log.get(i).getWork());
						System.out.println("������ �½��ϱ�?");
						System.out.println("1. �� / 2. �ƴϿ� / 3. ����");
						input_select = in.nextInt();
						if (input_select == 1) {
							searched_index = i;
							System.out.println("�����ϴ� ������ ���� �����Ǹ�, ������ �Ұ����մϴ�.");
							System.out.println("������ �����Ͻðڽ��ϱ�?");
							System.out.println("1. �� / 2.�ƴϿ�");
							input_select = in.nextInt();
							if (input_select == 1) {
								System.out.println(b_log.get(searched_index).toString3() + "�� �����Ǿ����ϴ�.");
								b_log.remove(searched_index);
								flag = false;
								break;
							} else if (input_select == 2) {
								System.out.println("�ٽ� �����޴� ó������ ���ư��ϴ�.");
							}
						} else if (input_select == 2) {
							System.out.println("�ٽ� �����޴� ó������ ���ư��ϴ�.");
						} else if (input_select == 3) {
							System.out.println("�����մϴ�.");
							return;
						}
					}
				}
			}

		}
	}
}
