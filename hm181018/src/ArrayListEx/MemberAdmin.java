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
			System.out.println("�޴� ����");
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
				System.out.println("����˴ϴ�.");
				return;
			}
		}
	}

	private void menu() {
		System.out.println("1. ȸ�� ����");
		System.out.println("2. ȸ�� Ż��");
		System.out.println("3. ȸ�� ����");
		System.out.println("4. ȸ�� ���");
		System.out.println("5. ����");
	}

	private void add() {
		Member imsiMember = new Member();
		imsiMember.setId("k" + memberList.size());
		imsiMember.setName("kName");
		imsiMember.setPwd("1111");
		System.out.println("�߰� �Ǿ����ϴ�" + memberList.size());

		memberList.add(imsiMember);

	}

	private void del() {
		System.out.println("������ id �Է�");
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
		System.out.println("������ id �Է�");
		String modId = in.nextLine();
		int modIndex = searchMember(modId);

		if (modIndex != -1) {
			System.out.println("���ο� �̸� �Է�");
			memberList.get(modIndex).setName(in.nextLine());
		}
	}

	private void list() {
		for (int i = 0; i < memberList.size(); i++) {
//			System.out.println((i+1)+"��° �����");
//			memberList.get(i).viewInfo();
			Member imsiM = memberList.get(i);
			imsiM.viewInfo();
		}
	}
}
