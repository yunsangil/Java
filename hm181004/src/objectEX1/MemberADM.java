package objectEX1;

import java.util.Scanner;

public class MemberADM {
//	public MemberADM() { //객체가 만들어질때 제일 먼저 실행됨
//						 //
//		System.out.println("생성자");
//	}

//	public void MemberADM(){ //생성자는 절대 리턴값을 갖지 않는다.
//							//이것은 일반 메소드이다.
//		System.out.println("생성자2");
//	}
	private Member[] myMember = new Member[100];
	private Scanner in = new Scanner(System.in);

	public MemberADM() {
		init();
	}

	private void init() {
		boolean flag = true;
		while (flag) {
			menu();
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
				flag = false;

			}
		}
	}

	private void add() {
		Member m = new Member();
		// 아이디,패스워드는 8글자 이상 필요
		if (m.checkMember()) {
			for (int i = 0; i < myMember.length; i++) {
				if (myMember[i] == null) {
					System.out.println("생성");
					myMember[i] = m;
					break;
				}
			}
		} else {
			System.out.println("승인이 허락되지 않았습니다.");
			return;
		}
	}

	private void del() {

		System.out.println("삭제할 id 입력 >>");
		String dName = in.nextLine();
		int dMemberIndex = searchmember(dName);
		if (dMemberIndex != 1000) {
			if (myMember[dMemberIndex].checkPwd()) {
				System.out.println("삭제가 완료되었습니다.");
				myMember[dMemberIndex] = null;
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("id를 찾을 수 없습니다.");
		}

	} // id입력받고 pwd가 ok면 삭제
		// pwd가 ok가 안되면 삭제안함

	private void mod() {
		System.out.println("수정할 id 입력 >>");
		String sName = in.nextLine();
		int sMemberIndex = searchmember(sName);
		if (sMemberIndex != 1000) {
			myMember[sMemberIndex].mod();
		} else {
			System.out.println("id를 찾을 수 없습니다.");
		}

	}// 아이디검색

	private int searchmember(String id) {
		for (int i = 0; i < myMember.length; i++) {
			if (id.equals(myMember[i].getId())) {
				return i;
			}
		}
		return 1000;
	}

	private void list() {
		int count = 0;
		for (int i = 0; i < myMember.length; i++) {
			if (myMember[i] != null) {
				myMember[i].prt();
				count++;
			}
			if (count == 0) {
				System.out.println("아무것도 표시할 게 없습니다.");
				break;
			}

		}

	}

	private void menu() {
		System.out.println("1.add");
		System.out.println("2.del");
		System.out.println("3.mod");
		System.out.println("4.list");
		System.out.println("5.exit");
	}
}
