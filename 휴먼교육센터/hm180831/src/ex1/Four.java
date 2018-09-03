package ex1;
import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		//ctrl+shift+0
		
		int num1 = in.nextInt();
		System.out.println(num1);
		
		System.out.println("두번째 숫자를 입력하세요");

		int num2 = in.nextInt();
		System.out.println(num2);

		System.out.println("1. 더하기, 2. 빼기. 3. 곱하기 선택");
		int sign = in.nextInt();
		if (sign>3);
		{
			System.out.println("다시 입력하세요");
			System.out.println("1. 더하기, 2. 빼기. 3. 곱하기 선택");
			sign = in.nextInt();
		}
		//sign에 의해서 1이면 더한 값을, 2이면 빼기, 3이면 곱한 값을 
		//sum에 저장 후 출력하도록 작성

		int sum=0;
		int subtract=0;
		int multiply=0;
		if(sign==1) {
			sum=num1+num2;
			System.out.println("두 수의 합은 "+sum+" 입니다");
		}
		else if(sign==2) {
			subtract=num1-num2;
			System.out.println("두 수의 차는 "+subtract+" 입니다");
		}
		else if(sign==3) {
			multiply=num1 * num2;
			System.out.println("두 수의 곱은 "+multiply+" 입니다");
		}
	}
	
}
