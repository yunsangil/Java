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
		this.h_b_log = hl; // 한번 생성한걸 계속 생성해줄 수 없기에, Main 메소드에서 사용한 것을 그대로 가져와서 쓰기 위해서
							// business_log_document의 생성자는 Handling_business_log h1을 가져오게 된다.
	}

	public void Delete_Work_Contents() {
		System.out.println("업무 내용을 제거하기에 앞서, 업무 번호를 입력해주세요.");
		System.out.println("업무 일지 목록은 다음과 같습니다.");
		listOf_business_log.listOf_b_log(h_b_log.create_b_log.b_log);
		flag2 = listOf_business_log.flag;
		if (flag2 == false) {
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
						while (flag) {
							searched_index = i;
							System.out.println("삭제하는 내용은 완전 삭제되며, 복구가 불가능합니다.");
							System.out.println("정말로 삭제하시겠습니까?");
							System.out.println("1. 예 / 2. 아니오");
							input_select = in.nextInt();
							in.nextLine();
							if (input_select == 1) {

								System.out.println("현재 저장된 업무 내용은 다음과 같습니다.");

									System.out.println(h_b_log.create_b_log.b_log.get(searched_index).WorkContent.toString());
								System.out.println("삭제하려고 하는 업무 내용 번호를 입력해주세요.");
								del_CNum = in.nextLine();
								for (int k = 0; k < h_b_log.create_b_log.b_log.get(searched_index).WorkContent
										.size(); k++) {
									if (del_CNum.equals(h_b_log.create_b_log.b_log.get(searched_index).WorkContent
											.get(k).getContentNum())) {
										System.out.println(
												h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k));
										System.out.println("가 삭제되었습니다.");
										h_b_log.create_b_log.b_log.get(searched_index).WorkContent.remove(k);
										return;
									}

								}

							} else if (input_select == 2) {
								System.out.println("다시 처음으로 돌아갑니다.");
								break;
							}
						}
					} else if (input_select == 2) {
						System.out.println("다시 처음으로 돌아갑니다.");
						Delete_Work_Contents();
					}

				} else {
					System.out.println("업무 일지 번호를 다시 한번 확인해주세요.");
					return;
				}
			}
		}
	}
}
