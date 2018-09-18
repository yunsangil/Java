package Test01;

import java.util.Scanner;

public class ArrayEx1 {

	static String[] names = new String[10];
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// 메뉴 >> 선택 >> 추가
		// 수정
		// 삭제
		for (;;) {
			menu();
			String num = in.nextLine();
			switch (num) {

			case "1":
				newadd();
				break;
			case "2":
				delname();
				break;
			case "3":
				modname();
				break;
			case "4":
				listname();
				break;
			default:
				return;
			}

		}
	}

	public static void menu() {
		System.out.println("1. 추가");
		System.out.println("2. 삭제");
		System.out.println("3. 수정");
		System.out.println("4. 목록");
		System.out.println("input >>");

	}

	public static void newadd() {
		System.out.println("추가");
		System.out.println("이름을 입력하세요.");
		String name = in.nextLine();
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}

	}

	public static void delname() {

		System.out.println("삭제");
		System.out.println("삭제 할 이름을 입력하세요.");
		String delname = in.nextLine();
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(delname)) {
				names[i] = null;
			}
		}
	}

	public static void modname() {

		System.out.println("수정");
		System.out.println("수정 할 이름을 입력하세요.");
		String modname = in.nextLine();
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(modname)) {

				System.out.println("새로운 이름을 입력하세요.");
				String newname = in.nextLine();
				names[i] = newname;
			}
		}

	}

	public static void listname() {
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] :" + names[i]);
		}

	}
}
