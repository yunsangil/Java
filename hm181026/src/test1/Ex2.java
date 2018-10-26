package test1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		problem();
	}

	static void problem() {
		String input1 = "a", input2 = "b";
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("첫번째 숫자 입력");
			input1 = in.nextLine();
			int num1 = Integer.valueOf(input1);
			System.out.println("두번째 숫자 입력");
			input2 = in.nextLine();
			int num2 = Integer.valueOf(input2);
			System.out.println(num1 + num2);
		} catch (NumberFormatException e) {
			if (input1.equals("x") || input2.equals("x")) {
				System.out.println("종료");
				in.close();
				System.exit(0);
			}
			else {
				System.out.println("문자는 변환할 수 없다.");
				problem();
			}
		} finally {
			problem();
		}
	}
}
