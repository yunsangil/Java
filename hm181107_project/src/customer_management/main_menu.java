package customer_management;

import java.util.Scanner;

class main_menu {
	
//	1. ȸ�����
//	2. ȸ������
//	3. ȸ�� ����
//	4. ���� �� ����
	Admin admin = null;
	Scanner in = new Scanner(System.in);
	main_menu(){
		admin = new Admin();
		init();
	}

	void init() {
		while(true) {
			menu();
			int select = in.nextInt();
			in.nextLine();
			switch(select) {
			case 1:
				admin.Customer_add();
				break;
			case 2:
				admin.Customer_mod();
				break;
			case 3:
				admin.Customer_del();
				break;
			case 4:
				admin.CustomerList();
				break;
			case 5:
				admin.savetoFile();
				return;
			}
			
		}
	}
	
	
	void menu() {
		System.out.println("��Menu��������������������");
		System.out.println("1. ȸ�����");
		System.out.println("2. ȸ������");
		System.out.println("3. ȸ������");
		System.out.println("4. ȸ�����");
		System.out.println("5. ���� �� ����");
		System.out.println("����������������������������>");
		System.out.print(">");
	}
}
