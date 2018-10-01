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
			System.out.println("메뉴를 선택하세요.");
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
				System.out.println("종료합니다.");
				trueorfalse = false;
				break;
			}
		}
	}

	public void menu() {
		System.out.println("1. 주차");
		System.out.println("2. 출차");
		System.out.println("3. 주차현황");
		System.out.println("4. 종료");
	}

	public void Park_Car() {
		System.out.println("차량을 주차등록합니다.");
		newCar = new Car();
//		String carNum = null;
//		String carModel = null; -->현재 Car Class의 내용
//		System.out.println("차종을 입력해주세요.");
//		newCar.carModel = in.nextLine();
//		in.nextLine();
		int count=0;
		System.out.println("차번을 입력해주세요.");
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
					System.out.println("만차입니다.");
					return;
				}
				if (newCar.carNum % 5 == j && forPark[i][j] == null) {
					System.out.println(" 차번 " + newCar.carNum + "은" + i + "층" + j + "번 자리에 주차됩니다.");
					forPark[i][j] = newCar;
					return;
				}
			}
		}
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {

				if(newCar.carNum%5==j&&forPark[i][j]!=null && forPark[i+1][j]!=null && forPark[i][j+1]!=null && forPark[i+1][j+1]!=null&&j<forPark.length-1)
				{
					System.out.println("배정될 자리가 가득 찼습니다. 잠시만 기다려주세요.");
					return;
				}
				else if (newCar.carNum % 5 == j && j < forPark[i].length - 1 && forPark[i][j + 1] == null) {
					System.out.println(" 차번" + newCar.carNum + "은" + i + "층" + (j + 1) + "번 자리에 주차됩니다."+j);
					forPark[i][j + 1] = newCar;
					return;
				}

				else if (newCar.carNum % 5 == j && j < forPark[i].length - 1 && forPark[i][j + 1] != null) {

					System.out.println(" 차번" + newCar.carNum + "은" + (i + 1) + "층" + (j + 1) + "번 자리에 주차됩니다."+i+j);
					forPark[i + 1][j + 1] = newCar;
					return;
				}

				else if (newCar.carNum % 5 == j && j == 4 && forPark[i][0] == null) {
					System.out.println(" 차번" + newCar.carNum + "은" + i + "층" + "0번 자리에 주차됩니다.");
					forPark[i][0] = newCar;
					return;

				}

				else if (newCar.carNum % 5 == j && j == 4 && forPark[i][0] != null) {
					System.out.println(" 차번" + newCar.carNum + "은" + (i + 1) + "층" + "0번 자리에 주차됩니다.");
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
					System.out.println(" 차번 " + forPark[i][j].carNum + "은" + i + "층" + j + "번 자리에 주차되어 있습니다..");
				}
			}
		}
	}
}
