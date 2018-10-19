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

		System.out.println("관리자 로그인 메뉴를 선택하셨습니다.");
		System.out.println("※관리자가 아닌 사람이 로그인을 시도할 경우,해킹 시도로 간주, 불이익이 발생할 수도 있습니다.※");
		System.out.println("관리자 분이 맞으시면 1번 입력후 계속 진행, 잘못 입력하셨다면 2번을 입력하여 뒤로가기를 해주세요.");
		int admin_select = in.nextInt();
		in.nextLine();
		switch (admin_select) {
		case 1:
			admin_check();
			break;
		case 2:
			System.out.println("뒤로 갑니다.");
			break;
		}
	}

	void admin_check() {
		System.out.println("아이디를 입력해주세요.");
		input_id = in.nextLine();
		System.out.println("패스워드를 입력해주세요.");
		input_pwd = in.nextLine();

		if (input_id.equals(admin_id) && input_pwd.equals(admin_pwd)) {
			System.out.println("환영합니다. 관리자로 로그인하셨습니다.");
			checkAdmin = true;
		} else {
			System.out.println("아이디, 또는 패스워드가 틀렸습니다.");
			countFalse++;

			if (countFalse >= 5) {
				System.out.println("5회 이상 틀리셨습니다. 강제 종료됩니다.");
				countFalse = 0;
				System.exit(0);
			} else if (countFalse < 5) {
				admin_check();
			}
		}

	}

	void Product_add() {
		Product addproduct = new Product();
		System.out.println("상품명을 입력해주세요.");
		input_prdname = in.nextLine();
		addproduct.setProduct_name(input_prdname);
		System.out.println("상품 가격을 입력해주세요.");
		input_prdprice = in.nextInt();
		in.nextLine();
		addproduct.setProduct_price(input_prdprice);
		System.out.println("상품 수량을 입력해주세요.");
		input_prdamt = in.nextInt();
		in.nextLine();
		addproduct.setProduct_amount(input_prdamt);
		productlist.add(addproduct);

		System.out.println("상품 " + productlist.get(productlist.size() - 1).getProduct_name() + "이 정상 등록되었습니다.");
	}
}
