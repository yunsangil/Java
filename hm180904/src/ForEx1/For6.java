package ForEx1;
//import java.util.Scanner;
public class For6 {
	//5. 1+1+2+3+5+8+13=???
	//1부터 20까지 1씩 증가하는 for문에서 위와같은 연산이 되도록
	public static void main(String[] args) {
		
		int a=1,b=1,c=0,sum=0,result=0,result1=0,result2=0,value=0;;
//		Scanner in = new Scanner(System.in);
//		int range=in.nextInt();
//		for(int i=1;i<=range;i++) {
//
//			sum=a+b;
//
//			result=b+sum;
//			System.out.print(a+"+"+b+"+"+sum+"+"+result);
//
//			i++;
//			a=i;
//			b+=i;
//
//
//			sum=a+b;
//
//			result=b+sum;
//
//			result+=sum;
//			result1=result-sum;
//			System.out.print("+"+sum+"+"+result1);
//
//			result2=result1;
//			result1=sum+result1;
//			System.out.print("+"+result1);
//			
//			result1+=result2;
//			System.out.println("+"+result1);
//			i=20;
	 /*
						c=a+b 1+1--> 2 -->a+b 1+2 -->3
				a=b a=1 a=2
				b=c b=2 b=3
				1 1 2 3    5        8               13 21 34 55 89
				a b c b+c  c+(b+c) (b+c)+(c+(b+c))
				c= a+b
				a=b
				b=c
				-->a+b=b+c

		 							*/
		System.out.print(a+"+"+b);
		sum+=a+b;
		for(int i=0;i<=20;) {
			c=a+b;
			sum+=c;
			System.out.print("+"+c);
			a=b;
			b=c;
			i++;
		}


	}
}
