package business_log_Administration;

import java.util.ArrayList;
import java.util.Scanner;

public class update_business_log {

	private String mod_worknum,input_work;
	private int input_select, searched_index, input_year, input_month, input_day;
	private Scanner in = new Scanner(System.in);
	private boolean flag2 = false, flag3 = true;

	void update_logic(ArrayList<business_log> b_log) {
		boolean flag = true;
		while (flag) {
			System.out.println("�������� ���� �޴��Դϴ�. list�� �ҷ��ɴϴ�.");
			listOf_business_log.listOf_b_log(b_log);
			flag2 = listOf_business_log.flag;
			if (flag2 == false) {
				flag = false;
			} else {
				System.out.println("���� ��ȣ�� ������� ������ �����մϴ�. �����Ͻ� ���� ��ȣ�� �Է����ּ���.");
				mod_worknum = in.nextLine();

				for (int i = 0; i < b_log.size(); i++) {
					if (mod_worknum.equals(b_log.get(i).getWorkNum())) {
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
							in.nextLine();
							if (input_select == 1) {
								System.out.println("��� �����Ͻǰ̴ϱ�?");
								System.out.println("���� ���� :" + b_log.get(searched_index).toString4());
								System.out.println("1.������ /2.������ / 3.������ /4.���� �߿��� �����ϼ���.");
								input_select = in.nextInt();
								in.nextLine();
								if (input_select == 1) {
									flag3=true;
									while (flag3) {
										System.out.println("�������� �����մϴ�.");
										System.out.println("������ ��¥�� �Է��ϼ���.");

										input_year = in.nextInt();
										input_month = in.nextInt();
										input_day = in.nextInt(); // ����� ������ �ְ� ���޾� �Է��� �ص� �� ������ ������ �Ǽ� �Է��� �ȴ�.
										in.nextLine();
										System.out.println("�Է��Ͻ� ��¥�� " + input_year + "��" + input_month + "��"
												+ input_day + "�� �Դϴ�. �½��ϱ�?");
										System.out.println("1. �� / 2.�ƴϿ� / 3.����");
										input_select = in.nextInt();
										in.nextLine();
										if (input_select == 1) {
											System.out.println("������ �����մϴ�.");
											System.out.println("���� ��"+b_log.get(searched_index)+"����");
											b_log.get(searched_index).setLog_year(input_year);
											b_log.get(searched_index).setLog_month(input_month);
											b_log.get(searched_index).setLog_day(input_day);
											System.out.println(b_log.get(searched_index)+"�� ����˴ϴ�!");
											flag3=false;
											flag=false;
											System.out.println("������ �Ϸ�Ǿ����ϴ�!");
											break;
										} else if (input_select == 2) {
											System.out.println("�ٽ� �Է����ּ���.");
										}
										else if(input_select ==3)
										{
											break;
										}
									}
								} else if (input_select == 2) {
									flag3=true;
									while (flag3) {
										System.out.println("�������� �����մϴ�.");
										System.out.println("������ ��¥�� �Է��ϼ���.");

										input_year = in.nextInt();
										input_month = in.nextInt();
										input_day = in.nextInt(); // ����� ������ �ְ� ���޾� �Է��� �ص� �� ������ ������ �Ǽ� �Է��� �ȴ�.
										in.nextLine();
										System.out.println("�Է��Ͻ� ��¥�� " + input_year + "��" + input_month + "��"
												+ input_day + "�� �Դϴ�. �½��ϱ�?");
										System.out.println("1. �� / 2.�ƴϿ� / 3.����");
										input_select = in.nextInt();
										if (input_select == 1) {
											System.out.println("������ �����մϴ�.");
											System.out.println("���� ��"+b_log.get(searched_index).toString2()+"����");
											b_log.get(searched_index).setLimit_year(input_year);
											b_log.get(searched_index).setLimit_month(input_month);
											b_log.get(searched_index).setLimit_day(input_day);
											System.out.println(b_log.get(searched_index).toString2()+"�� ����˴ϴ�!");
											flag3=false;
											System.out.println("������ �Ϸ�Ǿ����ϴ�!");
											break;
										} else if (input_select == 2) {
											System.out.println("�ٽ� �Է����ּ���.");
										}
										else if(input_select ==3)
										{
											break;
										}
									}

								} else if (input_select == 3) {

									flag3=true;
									while (flag3) {
										System.out.println("�������� �����մϴ�.");
										System.out.println("������ �������� �Է��ϼ���.");

										input_work = in.nextLine();
										System.out.println("�Է��Ͻ� �������� " +input_work +" �Դϴ�. �½��ϱ�?");
										System.out.println("1. �� / 2.�ƴϿ� / 3.����");
										input_select = in.nextInt();
										if (input_select == 1) {
											System.out.println("������ �����մϴ�.");
											System.out.println("���� ��"+b_log.get(searched_index).getWork()+"����");
											b_log.get(searched_index).setWork(input_work);
											System.out.println(b_log.get(searched_index).getWork()+"�� ����˴ϴ�!");
											flag3=false;
											System.out.println("������ �Ϸ�Ǿ����ϴ�!");
											break;
										} else if (input_select == 2) {
											System.out.println("�ٽ� �Է����ּ���.");
										}
										else if(input_select ==3)
										{
											break;
										}
									}
								} else if (input_select == 4) {
									System.out.println("�����մϴ�.");
									return;
								}
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
