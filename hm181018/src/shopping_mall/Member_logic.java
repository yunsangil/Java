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
		System.out.println("�����Ͻ� ���̵� �Է����ּ���.");
		input_id = in.nextLine();
		new_Member.setId(input_id);
		System.out.println("����� �̸��� �Է����ּ���.");
		input_name = in.nextLine();
		new_Member.setName(input_name);
		System.out.println("��й�ȣ�� �Է����ּ���.");
		input_pwd = in.nextLine();
		new_Member.setPwd(input_pwd);

		memberList.add(new_Member);
		System.out.println(
				(memberList.size()) + "��° �����" + memberList.get(memberList.size() - 1).getName() + "�� ������ ȯ���մϴ�!");

	}

	boolean login() {
		System.out.println("�α��� ���̵� �Է����ּ���.");
		input_id = in.nextLine();

		System.out.println("��й�ȣ�� �Է����ּ���.");
		input_pwd = in.nextLine();

		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getId().equals(input_id) && memberList.get(i).getPwd().equals(input_pwd)) {
				System.out.println("�α��ο� �����ϼ̽��ϴ�." + memberList.get(i).getName() + "�� ȯ���մϴ�!");
				customer_name = memberList.get(i).getName();
				return true;
			}
			else
			{
				System.out.println("�α��ο� �����ϼ̽��ϴ�. ���̵�, ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
				countFalse++;
				if(countFalse>=5)
				{
					System.out.println("5ȸ �̻� �����ϼ̽��ϴ�. ���������մϴ�.");
					System.exit(0);
				}

			}
		}

		
		return false;
	}

}
