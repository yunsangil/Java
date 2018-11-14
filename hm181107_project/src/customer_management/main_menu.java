package customer_management;

import java.util.Scanner;

class main_menu {
	
//	1. 회원등록
//	2. 회원삭제
//	3. 회원 수정
//	4. 저장 및 종료
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
		System.out.println("─Menu─────────┐");
		System.out.println("1. 회원등록");
		System.out.println("2. 회원수정");
		System.out.println("3. 회원삭제");
		System.out.println("4. 회원목록");
		System.out.println("5. 저장 및 종료");
		System.out.println("└─────────────>");
		System.out.print(">");
	}
}
