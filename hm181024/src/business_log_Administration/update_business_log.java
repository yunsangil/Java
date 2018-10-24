package business_log_Administration;

import java.util.ArrayList;
import java.util.Scanner;

public class update_business_log {

	private String mod_worknum,input_work;
	private int input_select, searched_index, input_year, input_month, input_day;
	private Scanner in = new Scanner(System.in);
	private boolean flag2 = false, flag3 = true;

	void update_logic(ArrayList<business_log> b_log) {
		boolean flag = true;
		while (flag) {
			System.out.println("업무일지 수정 메뉴입니다. list를 불러옵니다.");
			listOf_business_log.listOf_b_log(b_log);
			flag2 = listOf_business_log.flag;
			if (flag2 == false) {
				flag = false;
			} else {
				System.out.println("업무 번호를 기반으로 수정을 진행합니다. 수정하실 업무 번호를 입력해주세요.");
				mod_worknum = in.nextLine();

				for (int i = 0; i < b_log.size(); i++) {
					if (mod_worknum.equals(b_log.get(i).getWorkNum())) {
						System.out.println("수정할 업무명 :" + b_log.get(i).getWork());
						System.out.println("내용이 맞습니까?");
						System.out.println("1. 예 / 2. 아니오 / 3. 종료");
						input_select = in.nextInt();
						if (input_select == 1) {
							searched_index = i;
							System.out.println("수정하는 내용은 완전 수정되며, 복구가 불가능합니다.");
							System.out.println("정말로 수정하시겠습니까?");
							System.out.println("1. 예 / 2.아니오");
							input_select = in.nextInt();
							in.nextLine();
							if (input_select == 1) {
								System.out.println("어떤걸 수정하실겁니까?");
								System.out.println("현재 내용 :" + b_log.get(searched_index).toString4());
								System.out.println("1.시작일 /2.만료일 / 3.업무명 /4.종료 중에서 선택하세요.");
								input_select = in.nextInt();
								in.nextLine();
								if (input_select == 1) {
									flag3=true;
									while (flag3) {
										System.out.println("시작일을 수정합니다.");
										System.out.println("수정할 날짜를 입력하세요.");

										input_year = in.nextInt();
										input_month = in.nextInt();
										input_day = in.nextInt(); // 띄어쓰기로 구분을 주고 연달아 입력을 해도 세 변수가 구분이 되서 입력이 된다.
										in.nextLine();
										System.out.println("입력하신 날짜는 " + input_year + "년" + input_month + "월"
												+ input_day + "일 입니다. 맞습니까?");
										System.out.println("1. 예 / 2.아니오 / 3.종료");
										input_select = in.nextInt();
										in.nextLine();
										if (input_select == 1) {
											System.out.println("수정을 실행합니다.");
											System.out.println("이전 값"+b_log.get(searched_index)+"에서");
											b_log.get(searched_index).setLog_year(input_year);
											b_log.get(searched_index).setLog_month(input_month);
											b_log.get(searched_index).setLog_day(input_day);
											System.out.println(b_log.get(searched_index)+"로 변경됩니다!");
											flag3=false;
											flag=false;
											System.out.println("수정이 완료되었습니다!");
											break;
										} else if (input_select == 2) {
											System.out.println("다시 입력해주세요.");
										}
										else if(input_select ==3)
										{
											break;
										}
									}
								} else if (input_select == 2) {
									flag3=true;
									while (flag3) {
										System.out.println("만료일을 수정합니다.");
										System.out.println("수정할 날짜를 입력하세요.");

										input_year = in.nextInt();
										input_month = in.nextInt();
										input_day = in.nextInt(); // 띄어쓰기로 구분을 주고 연달아 입력을 해도 세 변수가 구분이 되서 입력이 된다.
										in.nextLine();
										System.out.println("입력하신 날짜는 " + input_year + "년" + input_month + "월"
												+ input_day + "일 입니다. 맞습니까?");
										System.out.println("1. 예 / 2.아니오 / 3.종료");
										input_select = in.nextInt();
										if (input_select == 1) {
											System.out.println("수정을 실행합니다.");
											System.out.println("이전 값"+b_log.get(searched_index).toString2()+"에서");
											b_log.get(searched_index).setLimit_year(input_year);
											b_log.get(searched_index).setLimit_month(input_month);
											b_log.get(searched_index).setLimit_day(input_day);
											System.out.println(b_log.get(searched_index).toString2()+"로 변경됩니다!");
											flag3=false;
											System.out.println("수정이 완료되었습니다!");
											break;
										} else if (input_select == 2) {
											System.out.println("다시 입력해주세요.");
										}
										else if(input_select ==3)
										{
											break;
										}
									}

								} else if (input_select == 3) {

									flag3=true;
									while (flag3) {
										System.out.println("업무명을 수정합니다.");
										System.out.println("수정할 업무명을 입력하세요.");

										input_work = in.nextLine();
										System.out.println("입력하신 업무명은 " +input_work +" 입니다. 맞습니까?");
										System.out.println("1. 예 / 2.아니오 / 3.종료");
										input_select = in.nextInt();
										if (input_select == 1) {
											System.out.println("수정을 실행합니다.");
											System.out.println("이전 값"+b_log.get(searched_index).getWork()+"에서");
											b_log.get(searched_index).setWork(input_work);
											System.out.println(b_log.get(searched_index).getWork()+"로 변경됩니다!");
											flag3=false;
											System.out.println("수정이 완료되었습니다!");
											break;
										} else if (input_select == 2) {
											System.out.println("다시 입력해주세요.");
										}
										else if(input_select ==3)
										{
											break;
										}
									}
								} else if (input_select == 4) {
									System.out.println("종료합니다.");
									return;
								}
							} else if (input_select == 2) {
								System.out.println("다시 수정메뉴 처음으로 돌아갑니다.");
							}
						} else if (input_select == 2) {
							System.out.println("다시 수정메뉴 처음으로 돌아갑니다.");
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
