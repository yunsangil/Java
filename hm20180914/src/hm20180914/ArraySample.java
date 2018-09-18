package hm20180914;

//ȸ�� ���
//ȸ�� ����
///ȸ�� ����
//
import java.util.Scanner;

public class ArraySample {
	static String[] name = new String[5];
	// int[] �迭�� ����Ǹ� �ʱⰪ�� 0
	// Strng[]] �迭�� �ʱⰪ�� null
	static boolean checkroop = true;
	static int count = 0;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		// �޴��� �����ְ� �ش�Ǵ� �޴��� �����ϸ� �ش�Ǵ� ���� ó��
		while (checkroop) {
			menu();
			System.out.println("�޴����� >");
			String selNum = in.nextLine();

			switch (selNum) {
			case "1":
				add();
				break;
			case "2":
				del();
				break;
			case "3":
				mod();
				break;
			case "4":
				printname();
				break;
			case "5":
				checkroop = false;
				System.out.println("����˴ϴ�.");
			default:
				System.out.println("1���� 4���� �Է��ؾ� �մϴ�.");
				break;

			}

		}
	}

	public static void menu() {

		System.out.println("1. add");
		System.out.println("2. del");
		System.out.println("3. mod");
		System.out.println("4. list");
		System.out.println("5. exit");
	}

	public static void add() {
		// 1.Ű����κ��� �Է��� �޴´�.
		// 2. �ش�Ǵ� �̸��� �迭�� �����ؾ� �Ѵ�. �̋� �迭�� ����� Ǯ�̸� �����ϰ�. ����� ������ �ִٸ� null���� ���� �̸���
		// �����Ѵ�.
		// 3.�̸��� �ߺ��Ǽ� �Է����� �ʴ´�.
		// 4.�̸��� �ߺ��Ǽ� �Է����� �ʴ´�. �׷��� ���� ���δ� �ϴ� ����� �ߺ�üũ�� �����ϸ� ��
		System.out.println("�Է� �޴��� �����ϼ̽��ϴ�. ������� �Էµ� ���� ������ �����ϴ�.");
		printname();
		System.out.println("�� �濡������ ���ʴ�� �Էµ˴ϴ�. ���� �� ���� ��ȣ��" + count + "�Դϴ�. �Է��� ���� �Է����ּ���.");
		String addname = in.nextLine();
		
		for(int i=0;i<name.length;i++)
		{
			if(name[i].equals(addname))
			{
				System.out.println("�ߺ��� ���� �Է��ϼ̽��ϴ�.");
				return;
			}
		}

		if (count < name.length) {
			name[count] = addname;

			System.out.println("name[" + count + "]�� �濡 �Էµ� ����" + name[count] + "�Դϴ�");
			count++;
		} else {
			System.out.println("�迭�� ���� á���ϴ�.");
		}
	}

	public static void del() {
		System.out.println("���� �޴��� �����ϼ̽��ϴ�. ���� �Էµ� �����ʹ� ������ �����ϴ�.");
		printname();
		System.out.println("������ ���� ��ȣ�� �Է����ּ���.");
		int delname = in.nextInt();

		name[delname] = null;
		count = delname;

		System.out.println("���� �� �����ʹ� ������ �����ϴ�.");
		printname();
	}

	public static void mod() {
		System.out.println("���� �޴��� �����ϼ̽��ϴ�. ���� �Էµ� �����ʹ� ������ �����ϴ�.");
		printname();
		System.out.println("������ ���� ��ȣ�� �Է����ּ���.");
		int modnumber = in.nextInt();
		System.out.println("������ ������ ���� �Է����ּ���.");
		String modname = in.nextLine();
		name[modnumber] = modname;
		System.out.println("���� �� �����ʹ� ������ �����ϴ�.");
		printname();
	}

	public static void printname() {
		for (int i = 0; i < name.length; i++) {
			System.out.println("name[" + i + "] :" + name[i]);
		}
	}
}
