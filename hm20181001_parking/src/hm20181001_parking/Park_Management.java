package hm20181001_parking;

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
//		String carNum = null;
//		String carModel = null; -->���� Car Class�� ����
//		System.out.println("������ �Է����ּ���.");
//		newCar.carModel = in.nextLine();
//		in.nextLine();
		int count=0;
		System.out.println("������ �Է����ּ���.");
		newCar.carNum = in.nextInt();
		in.nextLine();
//		for (int i = 0; i < forPark.length; i++) {
//			for (int j = 0; j < forPark[i].length; j++) {
//
//			}
//		}
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {
				if(forPark[i][j]!=null)
				{
					count++;
				}
				if(count==10)
				{
					System.out.println("�����Դϴ�.");
					return;
				}
				if (newCar.carNum % 5 == j && forPark[i][j] == null) {
					System.out.println(" ���� " + newCar.carNum + "��" + i + "��" + j + "�� �ڸ��� �����˴ϴ�.");
					forPark[i][j] = newCar;
					return;
				}
			}
		}
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {

				if(newCar.carNum%5==j&&forPark[i][j]!=null && forPark[i+1][j]!=null && forPark[i][j+1]!=null && forPark[i+1][j+1]!=null&&j<forPark.length-1)
				{
					System.out.println("������ �ڸ��� ���� á���ϴ�. ��ø� ��ٷ��ּ���.");
					return;
				}
				else if (newCar.carNum % 5 == j && j < forPark[i].length - 1 && forPark[i][j + 1] == null) {
					System.out.println(" ����" + newCar.carNum + "��" + i + "��" + (j + 1) + "�� �ڸ��� �����˴ϴ�."+j);
					forPark[i][j + 1] = newCar;
					return;
				}

				else if (newCar.carNum % 5 == j && j < forPark[i].length - 1 && forPark[i][j + 1] != null) {

					System.out.println(" ����" + newCar.carNum + "��" + (i + 1) + "��" + (j + 1) + "�� �ڸ��� �����˴ϴ�."+i+j);
					forPark[i + 1][j + 1] = newCar;
					return;
				}

				else if (newCar.carNum % 5 == j && j == 4 && forPark[i][0] == null) {
					System.out.println(" ����" + newCar.carNum + "��" + i + "��" + "0�� �ڸ��� �����˴ϴ�.");
					forPark[i][0] = newCar;
					return;

				}

				else if (newCar.carNum % 5 == j && j == 4 && forPark[i][0] != null) {
					System.out.println(" ����" + newCar.carNum + "��" + (i + 1) + "��" + "0�� �ڸ��� �����˴ϴ�.");
					forPark[i + 1][0] = newCar;
					return;
				}

			}
		}

	}

	public void Leave_Car() {

	}

	public void List_Of_Car() {
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {
				if (forPark[i][j] != null) {
					System.out.println(" ���� " + forPark[i][j].carNum + "��" + i + "��" + j + "�� �ڸ��� �����Ǿ� �ֽ��ϴ�..");
				}
			}
		}
	}
}
