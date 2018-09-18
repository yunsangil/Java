package hm20180914;

//회원 등록
//회원 수정
///회원 삭제
//
import java.util.Scanner;

public class ArraySample {
	static String[] name = new String[5];
	// int[] 배열이 선언되면 초기값이 0
	// Strng[]] 배열은 초기값이 null
	static boolean checkroop = true;
	static int count = 0;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		// 메뉴를 보여주고 해당되는 메뉴를 선택하면 해당되는 일을 처리
		while (checkroop) {
			menu();
			System.out.println("메뉴선택 >");
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
				System.out.println("종료됩니다.");
			default:
				System.out.println("1부터 4까지 입력해야 합니다.");
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
		// 1.키보드로부터 입력을 받는다.
		// 2. 해당되는 이름을 배열에 삽입해야 한다. 이떄 배열에 사이즈가 풀이면 거절하고. 사이즈에 여유가 있다면 null값인 곳에 이름을
		// 저장한다.
		// 3.이름은 중복되서 입력하지 않는다.
		// 4.이름은 중복되서 입력하지 않는다. 그러나 나는 프로다 하는 사람은 중복체크를 구현하면 됨
		System.out.println("입력 메뉴를 선택하셨습니다. 현재까지 입력된 값은 다음과 같습니다.");
		printname();
		System.out.println("빈 방에서부터 차례대로 입력됩니다. 현재 빈 방의 번호는" + count + "입니다. 입력할 값을 입력해주세요.");
		String addname = in.nextLine();
		
		for(int i=0;i<name.length;i++)
		{
			if(name[i].equals(addname))
			{
				System.out.println("중복된 값을 입력하셨습니다.");
				return;
			}
		}

		if (count < name.length) {
			name[count] = addname;

			System.out.println("name[" + count + "]번 방에 입력된 값은" + name[count] + "입니다");
			count++;
		} else {
			System.out.println("배열이 가득 찼습니다.");
		}
	}

	public static void del() {
		System.out.println("삭제 메뉴를 선택하셨습니다. 현재 입력된 데이터는 다음과 같습니다.");
		printname();
		System.out.println("삭제할 방의 번호를 입력해주세요.");
		int delname = in.nextInt();

		name[delname] = null;
		count = delname;

		System.out.println("삭제 후 데이터는 다음과 같습니다.");
		printname();
	}

	public static void mod() {
		System.out.println("수정 메뉴를 선택하셨습니다. 현재 입력된 데이터는 다음과 같습니다.");
		printname();
		System.out.println("수정할 방의 번호를 입력해주세요.");
		int modnumber = in.nextInt();
		System.out.println("수정할 데이터 값을 입력해주세요.");
		String modname = in.nextLine();
		name[modnumber] = modname;
		System.out.println("수정 후 데이터는 다음과 같습니다.");
		printname();
	}

	public static void printname() {
		for (int i = 0; i < name.length; i++) {
			System.out.println("name[" + i + "] :" + name[i]);
		}
	}
}
