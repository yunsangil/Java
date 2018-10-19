package shopping_mall;

import java.util.ArrayList;
import java.util.Scanner;

class MemberAdmin {

	private String input_id, input_pwd, input_prdname;
	private int input_prdprice, input_prdamt;

	String admin_id = "Administrator";
	String admin_pwd = "Operating_Start";
	boolean checkAdmin = false;
	private Scanner in = new Scanner(System.in);
	ArrayList<Product> productlist = new ArrayList<>();
	public static int countFalse = 0;

	void login_admin() {

		System.out.println("������ �α��� �޴��� �����ϼ̽��ϴ�.");
		System.out.println("�ذ����ڰ� �ƴ� ����� �α����� �õ��� ���,��ŷ �õ��� ����, �������� �߻��� ���� �ֽ��ϴ�.��");
		System.out.println("������ ���� �����ø� 1�� �Է��� ��� ����, �߸� �Է��ϼ̴ٸ� 2���� �Է��Ͽ� �ڷΰ��⸦ ���ּ���.");
		int admin_select = in.nextInt();
		in.nextLine();
		switch (admin_select) {
		case 1:
			admin_check();
			break;
		case 2:
			System.out.println("�ڷ� ���ϴ�.");
			break;
		}
	}

	void admin_check() {
		System.out.println("���̵� �Է����ּ���.");
		input_id = in.nextLine();
		System.out.println("�н����带 �Է����ּ���.");
		input_pwd = in.nextLine();

		if (input_id.equals(admin_id) && input_pwd.equals(admin_pwd)) {
			System.out.println("ȯ���մϴ�. �����ڷ� �α����ϼ̽��ϴ�.");
			checkAdmin = true;
		} else {
			System.out.println("���̵�, �Ǵ� �н����尡 Ʋ�Ƚ��ϴ�.");
			countFalse++;

			if (countFalse >= 5) {
				System.out.println("5ȸ �̻� Ʋ���̽��ϴ�. ���� ����˴ϴ�.");
				countFalse = 0;
				System.exit(0);
			} else if (countFalse < 5) {
				admin_check();
			}
		}

	}

	void Product_add() {
		Product addproduct = new Product();
		System.out.println("��ǰ���� �Է����ּ���.");
		input_prdname = in.nextLine();
		addproduct.setProduct_name(input_prdname);
		System.out.println("��ǰ ������ �Է����ּ���.");
		input_prdprice = in.nextInt();
		in.nextLine();
		addproduct.setProduct_price(input_prdprice);
		System.out.println("��ǰ ������ �Է����ּ���.");
		input_prdamt = in.nextInt();
		in.nextLine();
		addproduct.setProduct_amount(input_prdamt);
		productlist.add(addproduct);

		System.out.println("��ǰ " + productlist.get(productlist.size() - 1).getProduct_name() + "�� ���� ��ϵǾ����ϴ�.");
	}
}
