package business_log_Administration;

import java.util.ArrayList;
import java.util.Scanner;

public class create_business_log {
	public ArrayList<business_log> b_log = new ArrayList<>();
	private Scanner in = new Scanner(System.in);
	private int input_year, input_month, input_day, input_select, limit_date; // 주로 입력이나, 계산에 활용되는 변수
	private String WorkNum; // 작업번호

	private String input_work;

	void create_logic_inputdate() {
		System.out.println("시작 날짜를 입력해주세요. (-는 뺴고 입력해야합니다. ex]18 10 24)");
		input_year = in.nextInt();
		input_month = in.nextInt();
		input_day = in.nextInt(); // 띄어쓰기로 구분을 주고 연달아 입력을 해도 세 변수가 구분이 되서 입력이 된다.
		in.nextLine();
		if (input_month > 12 || input_day > 30) {
			System.out.println("날짜를 제대로 입력해주세요!");
		} else {
			business_log add = new business_log(input_year, input_month, input_day);
			System.out.println("현재 입력하신 날짜는" + add + "입니다. 맞습니까?"); // business_log의 기본 toString이 year,month,day를 반환하므로
																	// 사용가능
			System.out.println("1. 예 / 2.아니오 / 3.종료");
			input_select = in.nextInt();
			in.nextLine();
			if (input_select == 1) {
				boolean flag = true;
				while (flag) {
					System.out.println("어떤 업무를 기록하시겠습니까?");
					input_work = in.nextLine();

					System.out.println("기록한 업무의 내용을 재확인 합니다.");
					System.out.println(input_work);
					System.out.println("내용이 맞습니까?");
					System.out.println("1. 예 / 2. 아니오");
					input_select = in.nextInt();
					in.nextLine();
					if (input_select == 1) {

						boolean flag2 = true;
						while (flag2) {
							System.out.println("만료 일자를 입력해주세요. (-는 뺴고 입력해야합니다. ex]18 10 25)");
							input_year = in.nextInt();
							input_month = in.nextInt();
							input_day = in.nextInt();
							if (input_month > 12 || input_day > 30) {
								System.out.println("날짜를 제대로 입력해주세요!");
							} else {
								add.setLimit_year(input_year); // business_log파일에도 설명이 있지만 setter가 따로 있는 이유는 실행 방식이 이렇게
																// 설정할 수 밖에 없기 때문이다.
								add.setLimit_month(input_month);
								add.setLimit_day(input_day);

								System.out.println("해당 내용을 기록합니다.");
								add.setWork(input_work);
								b_log.add(add);
								WorkNum = "W" + b_log.size();
								b_log.get(b_log.size() - 1).setWorkNum(WorkNum);

								System.out.println(
										add + "에 " + "업무 번호 : " + WorkNum + "업무명 : " + add.getWork() + "이 정상 기록되었습니다!");
								limit_date = (add.getLimit_year() * 365 + add.getLimit_month() * 30
										+ add.getLimit_day())
										- (add.getLog_year() * 365 + add.getLog_month() * 30 + add.getLog_day());
								System.out.println("만료일은 " + add.toString2() + "이고, 시작일 기준으로 남은 일수는" + limit_date
										+ "일 입니다. 숙지해주세요!");

								flag = false; // 루프 탈출
								flag2 = false;
							}
						}
					} else if (input_select == 2) {
						System.out.println("다시 처음으로 돌아갑니다.");
						System.out.println("계속하시려면 1번을, 업무일지 생성 중단을 원하시면 2를 입력해주세요.");
						input_select = in.nextInt();
						in.nextLine();
						if (input_select == 2) {
							System.out.println("중단됩니다.");
							return; // 클래스 종료
						}

					}
				}
			} else if (input_select == 2) { // 재귀호출
				System.out.println("다시 처음으로 돌아갑니다.");
				create_logic_inputdate();
			} else if (input_select == 3) // 처음 날짜 입력 후 3을 입력했을 때
			{
				System.out.println("종료합니다.");
				return;
			}

		}
	}

}
