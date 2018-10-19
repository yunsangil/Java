package shopping_mall;

import java.util.ArrayList;
import java.util.Scanner;

class Member_logic {
	private ArrayList<Member> memberList = new ArrayList<>();
	private Scanner in = new Scanner(System.in);
	private String input_id, input_name, input_pwd;
	int customer_number;
	String customer_name;
	private static int countFalse=0;
	boolean checkUser = false;
	void add() {
		Member new_Member = new Member();
		System.out.println("설정하실 아이디를 입력해주세요.");
		input_id = in.nextLine();
		new_Member.setId(input_id);
		System.out.println("당신의 이름을 입력해주세요.");
		input_name = in.nextLine();
		new_Member.setName(input_name);
		System.out.println("비밀번호를 입력해주세요.");
		input_pwd = in.nextLine();
		new_Member.setPwd(input_pwd);

		memberList.add(new_Member);
		System.out.println(
				(memberList.size()) + "번째 사용자" + memberList.get(memberList.size() - 1).getName() + "님 가입을 환영합니다!");

	}

	boolean login() {
		System.out.println("로그인 아이디를 입력해주세요.");
		input_id = in.nextLine();

		System.out.println("비밀번호를 입력해주세요.");
		input_pwd = in.nextLine();

		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getId().equals(input_id) && memberList.get(i).getPwd().equals(input_pwd)) {
				System.out.println("로그인에 성공하셨습니다." + memberList.get(i).getName() + "님 환영합니다!");
				customer_name = memberList.get(i).getName();
				return true;
			}
			else
			{
				System.out.println("로그인에 실패하셨습니다. 아이디, 비밀번호를 다시 확인해주세요.");
				countFalse++;
				if(countFalse>=5)
				{
					System.out.println("5회 이상 실패하셨습니다. 강제종료합니다.");
					System.exit(0);
				}

			}
		}

		
		return false;
	}

}
