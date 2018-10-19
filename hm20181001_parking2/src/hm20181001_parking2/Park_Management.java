package hm20181001_parking2;

import java.text.SimpleDateFormat;
import java.util.Date;
//입차시간 출차시간
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
		int count = 0;
		System.out.println("차번을 입력해주세요.");
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
					System.out.println("만차입니다.");
					return;
				}
				if (newCar.carNum % 5 == j && forPark[i][j] == null) {
					System.out.println(" 차번 " + newCar.carNum + "은" + i + "층" + j + "번 자리에 주차됩니다.");
					System.out.println("입차 시간은 " + newCar.parktime + "입니다");
					forPark[i][j] = newCar;
					return;
				}
			}
		}
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {
				if (forPark[1][4] != null && forPark[0][0] != null && forPark[1][0] != null) {
					System.out.println("지정된 자리가 가득 찼습니다.");
					return;
				}
				if (newCar.carNum % 5 == 4 && forPark[1][4] != null && forPark[0][0] != null) {
					System.out.println(" 차번 " + newCar.carNum + "은" + (i + 1) + "층" + 0 + "번 자리에 주차됩니다.");
					forPark[i + 1][0] = newCar;
					return;
				} else if (newCar.carNum % 5 == 4 && forPark[1][4] != null) {
					System.out.println(" 차번 " + newCar.carNum + "은" + i + "층" + 0 + "번 자리에 주차됩니다.");
					forPark[i][0] = newCar;
					return;
				}
				if (newCar.carNum % 5 == j && forPark[1][j + 1] != null) {
					System.out.println("지정된 자리가 가득 찼습니다.");
					return;
				}
				if (newCar.carNum % 5 == j && forPark[0][j + 1] != null) {

					System.out.println(" 차번 " + newCar.carNum + "은" + (i + 1) + "층" + (j + 1) + "번 자리에 주차됩니다.");
					forPark[i + 1][j + 1] = newCar;
					return;
				} else if (newCar.carNum % 5 == j && forPark[i][j] != null) {
					System.out.println(" 차번 " + newCar.carNum + "은" + i + "층" + (j + 1) + "번 자리에 주차됩니다.");
					forPark[i][j + 1] = newCar;
					return;
				}
			}
		}
	}

	public void Leave_Car() {
		String leavetime = null;
		System.out.println("차량을 출차합니다.");
		System.out.println("차번을 입력해주세요.");
		int leavecar = in.nextInt();
		in.nextLine();
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {
				if (forPark[i][j] != null) {
					if (forPark[i][j].carNum == leavecar) {
						System.out.println("차번 " + forPark[i][j].carNum + "은" + i + "층" + j + "번 자리에서 출차하였습니다.");
						SimpleDateFormat park = new SimpleDateFormat("hh:mm:ss a");
						Date date = new Date();
						leavetime = park.format(date);
						System.out.println("출차 시간은 " + leavetime + "입니다.");
						forPark[i][j] = null;
					} else if (forPark[i][j].carNum != leavecar) {
						System.out.println("해당 차번은 주차되어있지 않습니다.");
					}
				}
			}
		}
	}

	public void List_Of_Car() {
		for (int i = 0; i < forPark.length; i++) {
			for (int j = 0; j < forPark[i].length; j++) {
				if (forPark[i][j] != null) {
					System.out.println(" 차번 " + forPark[i][j].carNum + "은" + i + "층" + j + "번 자리에 주차되어 있습니다..");
					System.out.println("입차 시간은 " + forPark[i][j].parktime + "입니다");
				}
			}
		}
	}
}