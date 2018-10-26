package test1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			while (true) {
				try {
					System.out.println("첫번째 숫자 입력");
					String sNum = in.nextLine();
					if (sNum.equals("x"))
						break;
					int num1 = Integer.valueOf(sNum);
					System.out.println("두번째 숫자 입력");
					sNum = in.nextLine();
					if (sNum.equals("x"))
						break;
					int num2 = Integer.valueOf(sNum);
					System.out.println(num1 + num2);
				} catch (NumberFormatException e) {
					System.out.println("문자는 변환할 수 없습니다.");
				} catch (Exception e) {

				}
			}
		} finally {
			if (in != null) {
				in.close();
				System.out.println("정상종료");
			}
		}
	}
}
