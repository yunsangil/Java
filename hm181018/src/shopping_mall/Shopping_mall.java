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

			System.out.println("메뉴를 선택하세요.");
			int select = in.nextInt();
			in.nextLine();
			switch (select) {
			case 1:
				if (Admin.checkAdmin == false && logic.checkUser == false) {
					Admin.login_admin();
					break;
				} else if (Admin.checkAdmin == true && logic.checkUser == false) {
					System.out.println("관리자 로그아웃 합니다. 수고하셨습니다.");
					Admin.checkAdmin = false;
					break;
				} else if (logic.checkUser == true && Admin.checkAdmin == false) {
					System.out.println("사용자 로그아웃 합니다. 감사합니다!");
					logic.checkUser = false;
					break;
				}
			case 2:
				if (logic.checkUser == false && Admin.checkAdmin == false) {
					logic.add();
					break;
				} else if (Admin.checkAdmin == true && logic.checkUser == false) {
					System.out.println("회원 가입 정책 관리 기능은 현재 지원하지 않습니다.");
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
					System.out.println("종료합니다.");
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

			System.out.println("1.사용자 로그아웃");
			System.out.println("2.쇼핑");
			System.out.println("3.장바구니");
			System.out.println("4.종료");
		}

		else if (Admin.checkAdmin == false && logic.checkUser == false) {
			System.out.println("1.관리자 로그인");
			System.out.println("2.회원 가입");
			System.out.println("3.로그인");
			System.out.println("4.종료");
		} else if (Admin.checkAdmin == true) {
			System.out.println("1.관리자 로그아웃");
			System.out.println("2.회원 가입 정책 관리");
			System.out.println("3.로그인 정책 관리");
			System.out.println("4.상품 관리");
			System.out.println("5.종료");

		}
	}

	private void user_shopping() {
		int say_yes_or_no = 0;
		System.out.println("쇼핑 메뉴입니다. 현재 등록된 상품은 다음과 같습니다..");
		for (int i = 0; i < Admin.productlist.size(); i++) {
			System.out.println("상품명 : " + Admin.productlist.get(i).getProduct_name());
			System.out.println("수량 : " + Admin.productlist.get(i).getProduct_amount());
			System.out.println("가격 : " + Admin.productlist.get(i).getProduct_price());
		}
		System.out.println("구매하실 상품이 이 중에 있나요?");
		System.out.println("1. 예 / 2. 아니오");
		say_yes_or_no = in.nextInt();
		in.nextLine();
		if (say_yes_or_no == 1) {
			user_wanttobuy();
		} else if (say_yes_or_no == 2) {
			System.out.println("뒤로 갑니다.");
			return;
		}
	}

	private void user_wanttobuy() {
		int say_yes_or_no = 0;
		System.out.println("구매하실 상품의 이름을 입력해주세요.");
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
			System.out.println("구매하실 상품의 수량을 입력해주세요.");
			input_amount = in.nextInt();
			in.nextLine();
			if (input_amount < searched_index_amount) {
				user_pay = input_amount * searched_index_price;
				System.out.println("현재 희망 구매 수량은 " + input_amount + "개 이며," + "지불 예정 금액은 " + user_pay + "원 입니다.");

				System.out.println("구매하시겠습니까? ");
				System.out.println("1. 예 / 2. 아니오");
				say_yes_or_no = in.nextInt();
				in.nextLine();

				if (say_yes_or_no == 1) {
					Product userbuy = new Product();
					userbuy.setProduct_name(Admin.productlist.get(searched_index).getProduct_name());
					userbuy.setProduct_amount(input_amount);
					userbuy.setProduct_price(user_pay);

					basket.add(userbuy);
					System.out.println("장바구니 등록이 완료되었습니다.");
					return;
				} else if (say_yes_or_no == 2) {
					System.out.println("쇼핑메뉴 처음으로 갑니다.");
					user_shopping();
				}

			} else {
				System.out.println("현재 보유하고 있는 수량보다 주문하는 수량이 더 많습니다!");
				System.out.println("구매 단계 처음으로 이동합니다.");
				user_wanttobuy();
			}
		} else {
			System.out.println("존재하지 않는 상품이네요!");
			System.out.println("쇼핑메뉴 처음으로 갑니다.");
			user_shopping();
		}

	}

	private void basket() {
		System.out.println("현재 " + logic.customer_name + "님의 장바구니 목록은 이렇습니다.");
		for (int i = 0; i < basket.size(); i++) {
			System.out.println("상품 명:"+basket.get(i).getProduct_name());
			System.out.println("수량 : " + basket.get(i).getProduct_amount());
			System.out.println("지불 예정 금액 : " + basket.get(i).getProduct_price());
		}
	}
}
