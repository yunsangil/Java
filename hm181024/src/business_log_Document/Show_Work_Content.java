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

	public Show_Work_Content(Handling_business_log hl) { //Add_Work_Content와 내용이 흡사하다.
		this.h_b_log = hl;
	}

	public void show() {

		System.out.println("업무 일지 목록은 다음과 같습니다.");
		listOf_business_log.listOf_b_log(h_b_log.create_b_log.b_log);
		flag = listOf_business_log.flag;
		if (flag == false) {
			return;
		} else {
			System.out.println("업무일지 번호를 입력해주세요.");
			input_num = in.nextLine();

			for (int i = 0; i < h_b_log.create_b_log.b_log.size(); i++) {
				if (input_num.equals(h_b_log.create_b_log.b_log.get(i).getWorkNum())) {
					System.out.println("업무 일지 번호 :" + h_b_log.create_b_log.b_log.get(i).getWorkNum());
					System.out.println("업무명 :" + h_b_log.create_b_log.b_log.get(i).getWork());
					System.out.println("이 맞습니까?");
					System.out.println("1. 예 / 2. 아니오");
					input_select = in.nextInt();
					in.nextLine();

					if (input_select == 1) {
						searched_index = i;
						System.out.println("조회 업무 내용은 다음과 같습니다.");
						for (int k = 0; k < h_b_log.create_b_log.b_log.get(searched_index).WorkContent.size(); k++) {
							System.out.println(
									h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k).toString());

							System.out.println("추가로 조회하실 업무 일지 번호가 있나요?");
							System.out.println("1.예 / 2.아니오");
							input_select = in.nextInt();
							in.nextLine();
							if (input_select == 1) {
								System.out.println("다시 처음으로 돌아갑니다.");
								show();
							} else if (input_select == 2) {
								System.out.println("업무일지 조회 종료");
								break;
							}
						}

					} else if (input_select == 2) {
						System.out.println("다시 처음으로 돌아갑니다.");
						show();
					}

				} else {
					System.out.println("업무 일지 번호를 다시 한번 확인해주세요.");
					return;
				}
			}
		}
	}
}
