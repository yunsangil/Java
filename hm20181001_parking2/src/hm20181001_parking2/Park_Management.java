package hm20181001_parking2;

import java.text.SimpleDateFormat;
import java.util.Date;
//�����ð� �����ð�
import java.util.Scanner;

public class Park_Management {
	Scanner in = new Scanner(System.in);
	Car[][] forPark = new Car[2][5];
	Car newCar;

	Park_Management() {
		boolean trueorfalse = true;
		while (trueorfalse) {
			menu();
			System.out.println("�޴��� �����ϼ���.");
			int menuselect = in.nextInt();
			switch (menuselect) {
			case 1:
				Park_Car();
				break;
			case 2:
				Leave_Car();
				break;
			case 3:
				List_Of_Car();
				break;
			case 4:
				System.out.println("�����մϴ�.");
				trueorfalse = false;
				break;
			}
		}
	}

	public void menu() {
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ������Ȳ");
		System.out.println("4. ����");
	}

	public void Park_Car() {
		System.out.println("������ ��������մϴ�.");
		newCar = new Car();
		int count = 0;
		System.out.println("������ �Է����ּ���.");
		newCar.carNum = in.nextInt();
		in.nextLine();
		SimpleDateFormat park = new SimpleDateFormat("hh:mm:ss a");
		Date date = new Date();
		newCar.parktime = park.format(date);
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {
				if (forPark[i][j] != null) {
					count++;
				}
				if (count == 10) {
					System.out.println("�����Դϴ�.");
					return;
				}
				if (newCar.carNum % 5 == j && forPark[i][j] == null) {
					System.out.println(" ���� " + newCar.carNum + "��" + i + "��" + j + "�� �ڸ��� �����˴ϴ�.");
					System.out.println("���� �ð��� " + newCar.parktime + "�Դϴ�");
					forPark[i][j] = newCar;
					return;
				}
			}
		}
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {
				if (forPark[1][4] != null && forPark[0][0] != null && forPark[1][0] != null) {
					System.out.println("������ �ڸ��� ���� á���ϴ�.");
					return;
				}
				if (newCar.carNum % 5 == 4 && forPark[1][4] != null && forPark[0][0] != null) {
					System.out.println(" ���� " + newCar.carNum + "��" + (i + 1) + "��" + 0 + "�� �ڸ��� �����˴ϴ�.");
					forPark[i + 1][0] = newCar;
					return;
				} else if (newCar.carNum % 5 == 4 && forPark[1][4] != null) {
					System.out.println(" ���� " + newCar.carNum + "��" + i + "��" + 0 + "�� �ڸ��� �����˴ϴ�.");
					forPark[i][0] = newCar;
					return;
				}
				if (newCar.carNum % 5 == j && forPark[1][j + 1] != null) {
					System.out.println("������ �ڸ��� ���� á���ϴ�.");
					return;
				}
				if (newCar.carNum % 5 == j && forPark[0][j + 1] != null) {

					System.out.println(" ���� " + newCar.carNum + "��" + (i + 1) + "��" + (j + 1) + "�� �ڸ��� �����˴ϴ�.");
					forPark[i + 1][j + 1] = newCar;
					return;
				} else if (newCar.carNum % 5 == j && forPark[i][j] != null) {
					System.out.println(" ���� " + newCar.carNum + "��" + i + "��" + (j + 1) + "�� �ڸ��� �����˴ϴ�.");
					forPark[i][j + 1] = newCar;
					return;
				}
			}
		}
	}

	public void Leave_Car() {
		String leavetime = null;
		System.out.println("������ �����մϴ�.");
		System.out.println("������ �Է����ּ���.");
		int leavecar = in.nextInt();
		in.nextLine();
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {
				if (forPark[i][j] != null) {
					if (forPark[i][j].carNum == leavecar) {
						System.out.println("���� " + forPark[i][j].carNum + "��" + i + "��" + j + "�� �ڸ����� �����Ͽ����ϴ�.");
						SimpleDateFormat park = new SimpleDateFormat("hh:mm:ss a");
						Date date = new Date();
						leavetime = park.format(date);
						System.out.println("���� �ð��� " + leavetime + "�Դϴ�.");
						forPark[i][j] = null;
					} else if (forPark[i][j].carNum != leavecar) {
						System.out.println("�ش� ������ �����Ǿ����� �ʽ��ϴ�.");
					}
				}
			}
		}
	}

	public void List_Of_Car() {
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {
				if (forPark[i][j] != null) {
					System.out.println(" ���� " + forPark[i][j].carNum + "��" + i + "��" + j + "�� �ڸ��� �����Ǿ� �ֽ��ϴ�..");
					System.out.println("���� �ð��� " + forPark[i][j].parktime + "�Դϴ�");
				}
			}
		}
	}
}