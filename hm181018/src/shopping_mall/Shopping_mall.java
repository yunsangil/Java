package shopping_mall;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping_mall {

	MemberAdmin Admin = new MemberAdmin();
	Member_logic logic = new Member_logic();
	ArrayList<Product> basket = new ArrayList<>();
	private String input_name;
	private int input_amount, searched_index_amount, searched_index, searched_index_price, user_pay;

	private boolean product_is_there = false;

	Shopping_mall() {

		Start();
	}

	private Scanner in = new Scanner(System.in);

	private void Start() {

		while (true) {
			menu();

			System.out.println("�޴��� �����ϼ���.");
			int select = in.nextInt();
			in.nextLine();
			switch (select) {
			case 1:
				if (Admin.checkAdmin == false && logic.checkUser == false) {
					Admin.login_admin();
					break;
				} else if (Admin.checkAdmin == true && logic.checkUser == false) {
					System.out.println("������ �α׾ƿ� �մϴ�. �����ϼ̽��ϴ�.");
					Admin.checkAdmin = false;
					break;
				} else if (logic.checkUser == true && Admin.checkAdmin == false) {
					System.out.println("����� �α׾ƿ� �մϴ�. �����մϴ�!");
					logic.checkUser = false;
					break;
				}
			case 2:
				if (logic.checkUser == false && Admin.checkAdmin == false) {
					logic.add();
					break;
				} else if (Admin.checkAdmin == true && logic.checkUser == false) {
					System.out.println("ȸ�� ���� ��å ���� ����� ���� �������� �ʽ��ϴ�.");
					break;
				} else if (logic.checkUser == true && Admin.checkAdmin == false) {
					user_shopping();
					break;
				}
			case 3:
				if (logic.checkUser == false && Admin.checkAdmin == false) {
					logic.checkUser = logic.login();
					break;
				} else if (logic.checkUser == true && Admin.checkAdmin == false) {
					basket();
					break;
				}
			case 4:
				if (Admin.checkAdmin == false) {
					System.out.println("�����մϴ�.");
					return;
				} else if (Admin.checkAdmin == true) {
					Admin.Product_add();
					break;
				}
			}
		}
	}

	private void menu() {

		if (logic.checkUser == true) {

			System.out.println("1.����� �α׾ƿ�");
			System.out.println("2.����");
			System.out.println("3.��ٱ���");
			System.out.println("4.����");
		}

		else if (Admin.checkAdmin == false && logic.checkUser == false) {
			System.out.println("1.������ �α���");
			System.out.println("2.ȸ�� ����");
			System.out.println("3.�α���");
			System.out.println("4.����");
		} else if (Admin.checkAdmin == true) {
			System.out.println("1.������ �α׾ƿ�");
			System.out.println("2.ȸ�� ���� ��å ����");
			System.out.println("3.�α��� ��å ����");
			System.out.println("4.��ǰ ����");
			System.out.println("5.����");

		}
	}

	private void user_shopping() {
		int say_yes_or_no = 0;
		System.out.println("���� �޴��Դϴ�. ���� ��ϵ� ��ǰ�� ������ �����ϴ�..");
		for (int i = 0; i < Admin.productlist.size(); i++) {
			System.out.println("��ǰ�� : " + Admin.productlist.get(i).getProduct_name());
			System.out.println("���� : " + Admin.productlist.get(i).getProduct_amount());
			System.out.println("���� : " + Admin.productlist.get(i).getProduct_price());
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �߿� �ֳ���?");
		System.out.println("1. �� / 2. �ƴϿ�");
		say_yes_or_no = in.nextInt();
		in.nextLine();
		if (say_yes_or_no == 1) {
			user_wanttobuy();
		} else if (say_yes_or_no == 2) {
			System.out.println("�ڷ� ���ϴ�.");
			return;
		}
	}

	private void user_wanttobuy() {
		int say_yes_or_no = 0;
		System.out.println("�����Ͻ� ��ǰ�� �̸��� �Է����ּ���.");
		input_name = in.nextLine();

		for (int i = 0; i < Admin.productlist.size(); i++) {
			if (input_name.equals(Admin.productlist.get(i).getProduct_name()) ) {
				product_is_there = true;
				searched_index = i;
				searched_index_amount = Admin.productlist.get(i).getProduct_amount();
				searched_index_price = Admin.productlist.get(i).getProduct_price();
			}
		}

		if (product_is_there == true) {
			System.out.println("�����Ͻ� ��ǰ�� ������ �Է����ּ���.");
			input_amount = in.nextInt();
			in.nextLine();
			if (input_amount < searched_index_amount) {
				user_pay = input_amount * searched_index_price;
				System.out.println("���� ��� ���� ������ " + input_amount + "�� �̸�," + "���� ���� �ݾ��� " + user_pay + "�� �Դϴ�.");

				System.out.println("�����Ͻðڽ��ϱ�? ");
				System.out.println("1. �� / 2. �ƴϿ�");
				say_yes_or_no = in.nextInt();
				in.nextLine();

				if (say_yes_or_no == 1) {
					Product userbuy = new Product();
					userbuy.setProduct_name(Admin.productlist.get(searched_index).getProduct_name());
					userbuy.setProduct_amount(input_amount);
					userbuy.setProduct_price(user_pay);

					basket.add(userbuy);
					System.out.println("��ٱ��� ����� �Ϸ�Ǿ����ϴ�.");
					return;
				} else if (say_yes_or_no == 2) {
					System.out.println("���θ޴� ó������ ���ϴ�.");
					user_shopping();
				}

			} else {
				System.out.println("���� �����ϰ� �ִ� �������� �ֹ��ϴ� ������ �� �����ϴ�!");
				System.out.println("���� �ܰ� ó������ �̵��մϴ�.");
				user_wanttobuy();
			}
		} else {
			System.out.println("�������� �ʴ� ��ǰ�̳׿�!");
			System.out.println("���θ޴� ó������ ���ϴ�.");
			user_shopping();
		}

	}

	private void basket() {
		System.out.println("���� " + logic.customer_name + "���� ��ٱ��� ����� �̷����ϴ�.");
		for (int i = 0; i < basket.size(); i++) {
			System.out.println("��ǰ ��:"+basket.get(i).getProduct_name());
			System.out.println("���� : " + basket.get(i).getProduct_amount());
			System.out.println("���� ���� �ݾ� : " + basket.get(i).getProduct_price());
		}
	}
}
