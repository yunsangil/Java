import java.util.Scanner;

public class Calc {
	static int findlength = 0;

	public static void main(String[] args) {
		int result = 0;
		String str1="", str2="";
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 43 || input.charAt(i) == 45 || input.charAt(i) == 42) {
				findlength = i-1;
				continue;
			}
			for (i = 0; i < findlength; i++) {
				str1 += input.charAt(i);
			}
			for (i = findlength; i < input.length(); i++) {

				if (input.charAt(i) == 43 || input.charAt(i) == 45 || input.charAt(i) == 42 || input.charAt(i) == 32) {
					findlength++;
					continue;
					
				}
				
				str2 += input.charAt(i);
			}

			System.out.println(str1);
			System.out.println(str2);
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 43) {
				result = Integer.valueOf(str1) + Integer.valueOf(str2);
				break;
			} else if (input.charAt(i) == 45) {
				result = Integer.valueOf(str1) - Integer.valueOf(str2);
				break;
			} else if (input.charAt(i) == 42) {
				result = Integer.valueOf(str1) * Integer.valueOf(str2);
				break;
			}
		}
//
//		System.out.print(result);
	}
}