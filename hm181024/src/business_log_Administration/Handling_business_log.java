package business_log_Administration;

import java.util.Scanner;

public class Handling_business_log { // 총체적으로 business_log_Administration 패키지를
										// public 클래스인 Handling_business_log로 관리하려 했으나, 다른 클래스에서 Handling_business_log에서
										// 생성된 생성자에
										// 접근을 하려면 결국 제약조건을 public으로 해줘야했다.

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
				listOf_business_log.listOf_b_log(create_b_log.b_log); //클래스 메소드. 생성자를 따로 만들지 않았다.
				break;
			case 3:
				delete_b_log.delete_logic(create_b_log.b_log);
				break;
			case 4:
				update_b_log.update_logic(create_b_log.b_log);
				break;
			case 5:
				System.out.println("뒤로 갑니다.");
				flag = false;
				break;
			}
		}

	}

	void menu() {
		System.out.println("1. 업무일지 생성");
		System.out.println("2. 업무일지 목록");
		System.out.println("3. 업무일지 삭제");
		System.out.println("4. 업무일지 수정");
		System.out.println("5. 뒤로 가기");
	}

}
