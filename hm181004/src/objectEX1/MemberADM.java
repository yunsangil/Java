package objectEX1;

import java.util.Scanner;

public class MemberADM {
//	public MemberADM() { //��ü�� ��������� ���� ���� �����
//						 //
//		System.out.println("������");
//	}

//	public void MemberADM(){ //�����ڴ� ���� ���ϰ��� ���� �ʴ´�.
//							//�̰��� �Ϲ� �޼ҵ��̴�.
//		System.out.println("������2");
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
		// ���̵�,�н������ 8���� �̻� �ʿ�
		if (m.checkMember()) {
			for (int i = 0; i < myMember.length; i++) {
				if (myMember[i] == null) {
					System.out.println("����");
					myMember[i] = m;
					break;
				}
			}
		} else {
			System.out.println("������ ������� �ʾҽ��ϴ�.");
			return;
		}
	}

	private void del() {

		System.out.println("������ id �Է� >>");
		String dName = in.nextLine();
		int dMemberIndex = searchmember(dName);
		if (dMemberIndex != 1000) {
			if (myMember[dMemberIndex].checkPwd()) {
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				myMember[dMemberIndex] = null;
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("id�� ã�� �� �����ϴ�.");
		}

	} // id�Է¹ް� pwd�� ok�� ����
		// pwd�� ok�� �ȵǸ� ��������

	private void mod() {
		System.out.println("������ id �Է� >>");
		String sName = in.nextLine();
		int sMemberIndex = searchmember(sName);
		if (sMemberIndex != 1000) {
			myMember[sMemberIndex].mod();
		} else {
			System.out.println("id�� ã�� �� �����ϴ�.");
		}

	}// ���̵�˻�

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
				System.out.println("�ƹ��͵� ǥ���� �� �����ϴ�.");
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
