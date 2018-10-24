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
				System.out.println("업무내용 기록 메뉴입니다.");
				AWC.Add_Work_Contents();
				break;
			case 2:
				System.out.println("업무내용 조회 메뉴입니다.");
				SWC.show();
				break;
			case 3:
				System.out.println("업무내용 삭제 메뉴입니다.");
				DWC.Delete_Work_Contents();
				break;
			case 4:
				System.out.println("업무내용 수정 메뉴입니다.");
				UWC.Update_Work_Contents();
				break;
			case 5:
				System.out.println("종료합니다.");
				flag = false;
				return;
			}
		}
	}

	void menu() {
		System.out.println("1.업무 내용 작성");
		System.out.println("2.업무 내용 조회");
		System.out.println("3.업무 내용 삭제");
		System.out.println("4.업무 내용 수정");
		System.out.println("5.뒤로 가기");
	}
}
