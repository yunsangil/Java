package business_log_Document;

import java.util.Scanner;

import business_log_Administration.Handling_business_log;
import business_log_Administration.listOf_business_log;

public class Add_Work_Content {
	Handling_business_log h_b_log = null;
	private Scanner in = new Scanner(System.in);
	private String input_num, input_time, input_content,ContentNum;
	private int input_select, searched_index;
	private boolean flag2 = false;

	public Add_Work_Content(Handling_business_log hl) {
		this.h_b_log = hl; // 한번 생성한걸 계속 생성해줄 수 없기에, Main 메소드에서 사용한 것을 그대로 가져와서 쓰기 위해서
							// business_log_document의 생성자는 Handling_business_log h1을 가져오게 된다.
	}

	public void Add_Work_Contents() {
		System.out.println("업무 내용을 기록하기에 앞서, 업무 번호를 입력해주세요.");
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
						boolean flag = true;
						while (flag) {
							searched_index = i;
							Work_Content add = new Work_Content();
							System.out.println("기록하고자 하는 업무내용의 시간을 입력해주세요.");
							input_time = in.nextLine();
							System.out.println("기록하고자 하는 업무 내용을 입력해주세요.");
							input_content = in.nextLine();

							System.out.println("기록 시간 :" + input_time);
							System.out.println("기록 내용:" + input_content);
							System.out.println("가 맞습니까?");
							System.out.println("1. 예 / 2. 아니오");
							input_select = in.nextInt();
							in.nextLine();
							if (input_select == 1) {
								add.setTime(input_time);
								add.setContent(input_content);
								System.out.println("업무 내용을 기록합니다.");
								h_b_log.create_b_log.b_log.get(searched_index).WorkContent.add(add);
								System.out.println(h_b_log.create_b_log.b_log.get(i).WorkContent
										.get(h_b_log.create_b_log.b_log.get(i).WorkContent.size() - 1).getContent()
										+ "이 정상 기록되었습니다!");

								ContentNum = "C"+h_b_log.create_b_log.b_log.get(i).WorkContent.size();
								h_b_log.create_b_log.b_log.get(i).WorkContent
								.get(h_b_log.create_b_log.b_log.get(i).WorkContent.size() - 1).setContentNum(ContentNum);
								
								flag = false;
								break;
							} else if (input_select == 2) {
								System.out.println("다시 처음으로 돌아갑니다.");
								break;
							}
						}
					} else if (input_select == 2) {
						System.out.println("다시 처음으로 돌아갑니다.");
						Add_Work_Contents();
					}

				} else {
					System.out.println("업무 일지 번호를 다시 한번 확인해주세요.");
					return;
				}
			}
		}
	}
}
