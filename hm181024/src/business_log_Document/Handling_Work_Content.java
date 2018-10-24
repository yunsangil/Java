package business_log_Document;

import java.util.Scanner;

import business_log_Administration.Handling_business_log;

public class Handling_Work_Content {
	Scanner in = new Scanner(System.in);
	Handling_business_log h_b_log = null;
	private Add_Work_Content AWC = null;
	private Show_Work_Content SWC = null;
	private Delete_Work_Content DWC = null;
	private Update_Work_Content UWC = null;
	
	
	public Handling_Work_Content(Handling_business_log h1)
	{
		this.h_b_log = h1;
		DWC = new Delete_Work_Content(h_b_log);
		AWC = new Add_Work_Content(h_b_log);
		SWC = new Show_Work_Content(h_b_log);
		UWC = new Update_Work_Content(h_b_log);
	}
	
	public void init2() {
		boolean flag = true;
		while (flag) {
			int input_select = 0;
			menu();
			input_select = in.nextInt();
			in.nextLine();
			switch (input_select) {
			case 1:
				System.out.println("�������� ��� �޴��Դϴ�.");
				AWC.Add_Work_Contents();
				break;
			case 2:
				System.out.println("�������� ��ȸ �޴��Դϴ�.");
				SWC.show();
				break;
			case 3:
				System.out.println("�������� ���� �޴��Դϴ�.");
				DWC.Delete_Work_Contents();
				break;
			case 4:
				System.out.println("�������� ���� �޴��Դϴ�.");
				UWC.Update_Work_Contents();
				break;
			case 5:
				System.out.println("�����մϴ�.");
				flag = false;
				return;
			}
		}
	}

	void menu() {
		System.out.println("1.���� ���� �ۼ�");
		System.out.println("2.���� ���� ��ȸ");
		System.out.println("3.���� ���� ����");
		System.out.println("4.���� ���� ����");
		System.out.println("5.�ڷ� ����");
	}
}
