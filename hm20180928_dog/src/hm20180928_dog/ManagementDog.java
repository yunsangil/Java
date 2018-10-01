package hm20180928_dog;

import java.util.Scanner;

public class ManagementDog {

	Scanner in = new Scanner(System.in);
	Dog[] hmDog = new Dog[30];
	Dog newDog;

	ManagementDog() {
		boolean trueorfalse = true;
		while (trueorfalse) {
			menu();
			System.out.println("�޴��� �����ϼ���.");
			int menuselect = in.nextInt();
			in.nextLine();
			switch (menuselect) {
			case 1:
				add_dog();
				break;
			case 2:
				mod_dog();
				break;
			case 3:
				goodbye_dog();
				break;
			case 4:
				dog_list();
				break;
			case 5:
				view_for_vaccination();
				break;
			}
		}
	}

	public void menu() {
		System.out.println();
		System.out.println("1.������ ���");
		System.out.println("2.����(�������� ���� ����)");
		System.out.println("3.������ �о纸����");
		System.out.println("4.������ ��� ����");
		System.out.println("5.�������� ���");
	}

//	String name;
//	int ManagementNumber;
//	int age;
//	boolean vaccination;
	int checkvaccination = 0;

	public void add_dog() {
		System.out.println("�������� ����մϴ�.");
		newDog = new Dog();
		System.out.println("�������� �̸��� �Է����ּ���.");
		newDog.name = in.nextLine();
		System.out.println("�������� ���̸� �Է����ּ���");
		newDog.age = in.nextInt();
		in.nextLine();
		System.out.println("�������� ���������� �޾ҳ���? 1.�� 2.�ƴϿ�");
		checkvaccination = in.nextInt();
		in.nextLine();
		if (checkvaccination == 1) {
			newDog.vaccination = true;
		} else if (checkvaccination == 2) {
			newDog.vaccination = false;
		}
		for (int i = 1; i < hmDog.length; i++) {
			if (hmDog[i] == null) {
				System.out.println("����Ͻ� �������� ���� ��ȣ��" + i + "�� �Դϴ�.");
				newDog.ManagementNumber = i;
				hmDog[i] = newDog;
				break;
			}
			if(hmDog[hmDog.length-1] !=null)
			{
				System.out.println("�������� �ʹ� �����ϴ�!");
				return;
			}
		}

	}

	public void mod_dog() {
		System.out.println("�������� ������ �����մϴ�.");
		System.out.println("�������� ������ ������ �������� ��Ϲ�ȣ�� �Է����ּ���. (�ڷΰ���:00)");
		int selectdog = in.nextInt();
		in.nextLine();
		if (selectdog == 00) {
			return;
		} else {
			System.out.println("��� �ٲܱ��? 1.�ߴ�. 2.���ߴ�.");
			int checkvaccination = in.nextInt();
			in.nextLine();
			if (checkvaccination == 1) {
				hmDog[selectdog].vaccination = true;

				System.out.println("������ȣ" + selectdog + "���� �������� ���������� �� ������ ����˴ϴ�.");
			} else if (checkvaccination == 2) {
				hmDog[selectdog].vaccination = false;

				System.out.println("������ȣ" + selectdog + "���� �������� ���������� ���� ������ ����˴ϴ�.");
			}
		}
	}

	public void goodbye_dog() {
		System.out.println("� �������� �о纸���ǰǰ���? ������ȣ�� �Է����ּ���.");
		int goodbye = in.nextInt();
		in.nextLine();
		if(hmDog[goodbye]!=null)
		{
		System.out.println("������ȣ" + goodbye + "���� "+hmDog[goodbye].name+" �� �о��� ���������� ó���˴ϴ�. �߸� �Է��ϼ��� ��� 00���� �Է����ּ���.");
		System.out.println("���� ������ ���Ͻø� 1���� �Է����ּ���.");
		int realcheck = in.nextInt();
		if (realcheck == 00) {
			System.out.println("���� �޴��� ���ư��ϴ�.");
			return;
		} else if (realcheck == 1) {
			System.out.println(hmDog[goodbye].name+"��(��) �о� ���������� ó���մϴ�.");
			hmDog[goodbye] = null;
		}
		}
		else
		{
			System.out.println("������ȣ "+goodbye+"���� �������� �ʽ��ϴ�.");
		}

	}

	public void dog_list() {
		System.out.println("��ϵ� �������� ������ �����ϴ�.");
		for (int i = 1; i < hmDog.length; i++) {
			if (hmDog[i] != null) {
				System.out.print("��� ��ȣ :" + i + "/");
				System.out.print("������ �̸� :" + hmDog[i].name + "/");
				System.out.print("������ ���� :" + hmDog[i].age + "/");
				if (hmDog[i].vaccination == true) {
					System.out.println("���������� �޾ҽ��ϴ�.");
				} else if (hmDog[i].vaccination == false) {
					System.out.println("���������� ���� �ʾҽ��ϴ�.");
				}
			}
		}
	}

	public void view_for_vaccination() {
		System.out.println("�������� ����� ���������� ����մϴ�.");
		for (int i = 1; i < hmDog.length; i++) {
			if (hmDog[i] != null) {
				if (hmDog[i].vaccination == false) {
					System.out.println("�ؿ��� ���� ����");
					System.out.print("��� ��ȣ :" + i + "/");
					System.out.print("������ �̸� :" + hmDog[i].name + "/");
					System.out.println("������ ���� :" + hmDog[i].age);
				}
			}

		}
	}
}
