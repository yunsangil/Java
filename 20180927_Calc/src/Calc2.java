import java.util.Scanner;

public class Calc2 {
	static String str1 = null, str2 = null;
	static int findlength = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] calc = new String[3];
		for (int i=0; i<calc.length;i++)
		{
			calc[i]=in.next();
		}
		calcfunction(calc[1],Integer.valueOf(calc[0]),Integer.valueOf(calc[2]));
		
	}
	
	public static void calcfunction(String sign, int x, int y)
	{
		switch(sign) {
		case "+":
			System.out.println(x + y);
			break;
		case "-":
			System.out.println(x - y);
			break;
		case "*":
			System.out.println(x * y);
			break;
		}
	}

}
