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
			System.out.println("메뉴를 선택하세요.");
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
		System.out.println("1.강아지 등록");
		System.out.println("2.수정(예방접종 유무 변경)");
		System.out.println("3.강아지 분양보내기");
		System.out.println("4.강아지 목록 보기");
		System.out.println("5.예방접종 대상");
	}

//	String name;
//	int ManagementNumber;
//	int age;
//	boolean vaccination;
	int checkvaccination = 0;

	public void add_dog() {
		System.out.println("강아지를 등록합니다.");
		newDog = new Dog();
		System.out.println("강아지의 이름을 입력해주세요.");
		newDog.name = in.nextLine();
		System.out.println("강아지의 나이를 입력해주세요");
		newDog.age = in.nextInt();
		in.nextLine();
		System.out.println("강아지는 예방접종을 받았나요? 1.예 2.아니오");
		checkvaccination = in.nextInt();
		in.nextLine();
		if (checkvaccination == 1) {
			newDog.vaccination = true;
		} else if (checkvaccination == 2) {
			newDog.vaccination = false;
		}
		for (int i = 1; i < hmDog.length; i++) {
			if (hmDog[i] == null) {
				System.out.println("등록하신 강아지의 관리 번호는" + i + "번 입니다.");
				newDog.ManagementNumber = i;
				hmDog[i] = newDog;
				break;
			}
			if(hmDog[hmDog.length-1] !=null)
			{
				System.out.println("강아지가 너무 많습니다!");
				return;
			}
		}

	}

	public void mod_dog() {
		System.out.println("예방접종 유무를 변경합니다.");
		System.out.println("예방접종 유무를 변경할 강아지의 등록번호를 입력해주세요. (뒤로가기:00)");
		int selectdog = in.nextInt();
		in.nextLine();
		if (selectdog == 00) {
			return;
		} else {
			System.out.println("어떻게 바꿀까요? 1.했다. 2.안했다.");
			int checkvaccination = in.nextInt();
			in.nextLine();
			if (checkvaccination == 1) {
				hmDog[selectdog].vaccination = true;

				System.out.println("관리번호" + selectdog + "번의 강아지가 예방접증을 한 것으로 변경됩니다.");
			} else if (checkvaccination == 2) {
				hmDog[selectdog].vaccination = false;

				System.out.println("관리번호" + selectdog + "번의 강아지가 예방접증을 안한 것으로 변경됩니다.");
			}
		}
	}

	public void goodbye_dog() {
		System.out.println("어떤 강아지를 분양보내실건가요? 관리번호를 입력해주세요.");
		int goodbye = in.nextInt();
		in.nextLine();
		if(hmDog[goodbye]!=null)
		{
		System.out.println("관리번호" + goodbye + "번의 "+hmDog[goodbye].name+" 가 분양을 보낸것으로 처리됩니다. 잘못 입력하셨을 경우 00번을 입력해주세요.");
		System.out.println("정말 실행을 원하시면 1번을 입력해주세요.");
		int realcheck = in.nextInt();
		if (realcheck == 00) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		} else if (realcheck == 1) {
			System.out.println(hmDog[goodbye].name+"을(를) 분양 보낸것으로 처리합니다.");
			hmDog[goodbye] = null;
		}
		}
		else
		{
			System.out.println("관리번호 "+goodbye+"번은 존재하지 않습니다.");
		}

	}

	public void dog_list() {
		System.out.println("등록된 강아지는 다음과 같습니다.");
		for (int i = 1; i < hmDog.length; i++) {
			if (hmDog[i] != null) {
				System.out.print("등록 번호 :" + i + "/");
				System.out.print("강아지 이름 :" + hmDog[i].name + "/");
				System.out.print("강아지 나이 :" + hmDog[i].age + "/");
				if (hmDog[i].vaccination == true) {
					System.out.println("예방접종을 받았습니다.");
				} else if (hmDog[i].vaccination == false) {
					System.out.println("예방접종을 받지 않았습니다.");
				}
			}
		}
	}

	public void view_for_vaccination() {
		System.out.println("예방접종 대상인 강아지들을 출력합니다.");
		for (int i = 1; i < hmDog.length; i++) {
			if (hmDog[i] != null) {
				if (hmDog[i].vaccination == false) {
					System.out.println("※예방 접종 대상※");
					System.out.print("등록 번호 :" + i + "/");
					System.out.print("강아지 이름 :" + hmDog[i].name + "/");
					System.out.println("강아지 나이 :" + hmDog[i].age);
				}
			}

		}
	}
}
