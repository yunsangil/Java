package Test01;

import java.util.Scanner;

public class ArrayEx1 {

	static String[] names = new String[10];
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// �޴� >> ���� >> �߰�
		// ����
		// ����
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
		System.out.println("1. �߰�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ���");
		System.out.println("input >>");

	}

	public static void newadd() {
		System.out.println("�߰�");
		System.out.println("�̸��� �Է��ϼ���.");
		String name = in.nextLine();
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}

	}

	public static void delname() {

		System.out.println("����");
		System.out.println("���� �� �̸��� �Է��ϼ���.");
		String delname = in.nextLine();
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(delname)) {
				names[i] = null;
			}
		}
	}

	public static void modname() {

		System.out.println("����");
		System.out.println("���� �� �̸��� �Է��ϼ���.");
		String modname = in.nextLine();
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(modname)) {

				System.out.println("���ο� �̸��� �Է��ϼ���.");
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
