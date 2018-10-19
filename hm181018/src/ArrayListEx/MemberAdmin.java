package ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;


public class MemberAdmin {
	private Scanner in = new Scanner(System.in);
//	private Member[] memberList = new Member[10];
	private ArrayList<Member> memberList = new ArrayList<>();

	MemberAdmin() {
		init();
	}

	private void init() {
		while (true) {
			menu();
			System.out.println("메뉴 선택");
			int selNum = in.nextInt();
			in.nextLine();

			switch (selNum) {
			case 1:
				add();
				break;
			case 2:
				del();
				break;
			case 3:
				mod();
				break;
			case 4:
				list();
				break;
			case 5:
				System.out.println("종료됩니다.");
				return;
			}
		}
	}

	private void menu() {
		System.out.println("1. 회원 가입");
		System.out.println("2. 회원 탈퇴");
		System.out.println("3. 회원 수정");
		System.out.println("4. 회원 목록");
		System.out.println("5. 종료");
	}

	private void add() {
		Member imsiMember = new Member();
		imsiMember.setId("k" + memberList.size());
		imsiMember.setName("kName");
		imsiMember.setPwd("1111");
		System.out.println("추가 되었습니다" + memberList.size());

		memberList.add(imsiMember);

	}

	private void del() {
		System.out.println("삭제할 id 입력");
		String delId = in.nextLine();
		int delIndex = searchMember(delId);

		if (delIndex != -1) {
			memberList.remove(delIndex);
		}
	}

	private int searchMember(String id) {

		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;

	}

	private void mod() {
		System.out.println("수정할 id 입력");
		String modId = in.nextLine();
		int modIndex = searchMember(modId);

		if (modIndex != -1) {
			System.out.println("새로운 이름 입력");
			memberList.get(modIndex).setName(in.nextLine());
		}
	}

	private void list() {
		for (int i = 0; i < memberList.size(); i++) {
//			System.out.println((i+1)+"번째 사용자");
//			memberList.get(i).viewInfo();
			Member imsiM = memberList.get(i);
			imsiM.viewInfo();
		}
	}
}
