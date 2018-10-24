package business_log_Document;

import java.util.Scanner;

import business_log_Administration.Handling_business_log;
import business_log_Administration.listOf_business_log;

public class Update_Work_Content {
	Handling_business_log h_b_log = null;
	private Scanner in = new Scanner(System.in);
	private String input_num, mod_CNum,input_time,input_content;
	private int input_select, searched_index;
	private boolean flag = true, flag2 = false, flag3 = true;

	public Update_Work_Content(Handling_business_log hl) {
		this.h_b_log = hl; // 한번 생성한걸 계속 생성해줄 수 없기에, Main 메소드에서 사용한 것을 그대로 가져와서 쓰기 위해서
							// business_log_document의 생성자는 Handling_business_log h1을 가져오게 된다.
	}

	public void Update_Work_Contents() {
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
							System.out.println("수정하는 내용은 완전 수정되며, 복구가 불가능합니다.");
							System.out.println("정말로 수정하시겠습니까?");
							System.out.println("1. 예 / 2. 아니오");
							input_select = in.nextInt();
							in.nextLine();
							if (input_select == 1) {
								System.out.println("현재 저장된 업무 내용은 다음과 같습니다.");
								for(int j=0;j<h_b_log.create_b_log.b_log.get(searched_index).WorkContent
										.size();j++)
								{
									System.out.println(h_b_log.create_b_log.b_log.get(searched_index).WorkContent.toString());
								}
								System.out.println("수정하려고 하는 업무 내용 번호를 입력해주세요.");
								mod_CNum = in.nextLine();
								for (int k = 0; k < h_b_log.create_b_log.b_log.get(searched_index).WorkContent
										.size(); k++) {
									if (mod_CNum.equals(h_b_log.create_b_log.b_log.get(searched_index).WorkContent
											.get(k).getContentNum())) {
										System.out.println("어떤걸 수정하실겁니까?");
										System.out.println("현재 내용 :"
												+ h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k));
										System.out.println("1.시간 /2.내용 / 3.종료 중에서 선택하세요.");

										input_select = in.nextInt();
										in.nextLine();
										if (input_select == 1) {
											flag3 = true;
											while (flag3) {
												System.out.println("시간을 수정합니다.");
												System.out.println("수정할 시간을 입력하세요.");

												input_time = in.nextLine();
												System.out.println("입력하신 시간은 " +input_time+"입니다. 맞습니까?");
												System.out.println("1. 예 / 2.아니오 / 3.종료");
												input_select = in.nextInt();
												in.nextLine();
												if (input_select == 1) {
													System.out.println("수정을 실행합니다.");
													System.out.println("이전 값" + h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k).getTime() + "에서");
													h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k).setTime(input_time);
													System.out.println(h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k).getTime() + "로 변경됩니다!");
													flag3 = false;
													flag = false;
													System.out.println("수정이 완료되었습니다!");
													break;
												} else if (input_select == 2) {
													System.out.println("다시 입력해주세요.");
												} else if (input_select == 3) {
													break;
												}
											}
										} else if (input_select == 2) {
											flag3 = true;
											while (flag3) {
												System.out.println("내용을 수정합니다.");
												System.out.println("수정할 내용을 입력하세요.");
												
												input_content = in.nextLine();
												System.out.println("입력하신 내용은 " +input_content+"입니다. 맞습니까?");
												System.out.println("1. 예 / 2.아니오 / 3.종료");
												input_select = in.nextInt();
												in.nextLine();
												if (input_select == 1) {
													System.out.println("수정을 실행합니다.");
													System.out.println("이전 값" + h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k).getContent() + "에서");
													h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k).setContent(input_content);
													System.out.println(h_b_log.create_b_log.b_log.get(searched_index).WorkContent.get(k).getContent() + "로 변경됩니다!");
													flag3 = false;
													flag = false;
													System.out.println("수정이 완료되었습니다!");
													break;
												} else if (input_select == 2) {
													System.out.println("다시 입력해주세요.");
												} else if (input_select == 3) {
													break;
												}
											}

										} else if (input_select == 3) {
											System.out.println("종료합니다.");
											return;
										}
									}

								}

							} else if (input_select == 2) {
								System.out.println("다시 처음으로 돌아갑니다.");
								break;
							}
						}
					} else if (input_select == 2) {
						System.out.println("다시 처음으로 돌아갑니다.");
						Update_Work_Contents();
					}

				} else {
					System.out.println("업무 일지 번호를 다시 한번 확인해주세요.");
					return;
				}
			}
		}
	}
}
