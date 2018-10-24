package business_log_Administration;

import java.util.ArrayList;
import java.util.Scanner;

class delete_business_log { //delete는 중요한 사안이므로, 쉽게 접근할 수도 없게 같은 패키지 내에서 처리했다.

	private String del_worknum;
	private int input_select, searched_index;
	private Scanner in = new Scanner(System.in);
	private boolean flag2 = false;

	void delete_logic(ArrayList<business_log> b_log) {
		boolean flag = true;
		while (flag) {
			System.out.println("업무일지 삭제 메뉴입니다. list를 불러옵니다.");
			listOf_business_log.listOf_b_log(b_log);
			flag2 = listOf_business_log.flag;
			if (flag2 == false) {
				flag=false;
			} else {
				System.out.println("업무 번호를 기반으로 삭제를 진행합니다. 삭제하실 업무 번호를 입력해주세요.");
				del_worknum = in.nextLine();

				for (int i = 0; i < b_log.size(); i++) {
					if (del_worknum.equals(b_log.get(i).getWorkNum())) {
						System.out.println("삭제할 업무명 :" + b_log.get(i).getWork());
						System.out.println("내용이 맞습니까?");
						System.out.println("1. 예 / 2. 아니오 / 3. 종료");
						input_select = in.nextInt();
						if (input_select == 1) {
							searched_index = i;
							System.out.println("삭제하는 내용은 완전 삭제되며, 복구가 불가능합니다.");
							System.out.println("정말로 삭제하시겠습니까?");
							System.out.println("1. 예 / 2.아니오");
							input_select = in.nextInt();
							if (input_select == 1) {
								System.out.println(b_log.get(searched_index).toString3() + "가 삭제되었습니다.");
								b_log.remove(searched_index);
								flag = false;
								break;
							} else if (input_select == 2) {
								System.out.println("다시 삭제메뉴 처음으로 돌아갑니다.");
							}
						} else if (input_select == 2) {
							System.out.println("다시 삭제메뉴 처음으로 돌아갑니다.");
						} else if (input_select == 3) {
							System.out.println("종료합니다.");
							return;
						}
					}
				}
			}

		}
	}
}
