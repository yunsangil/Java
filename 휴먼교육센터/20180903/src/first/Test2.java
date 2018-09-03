package first;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//- + - + - + - + - +
		//+ - + - + - + -
		int sum=0;
		int sum2=0;
		Scanner in = new Scanner(System.in);
		System.out.println("범위를 입력해주세요.");
		int range=in.nextInt();
		for(int i=1;i<=range;i++) {
			if(i%2==0) {
				sum+=i;
				System.out.print("+"+i);
			}
			else if(i%2==1) {

				if(i==1) {
					System.out.print("1번 답 :"+"-"+i);
					sum-=i;
				}
				else {
				sum-=i;
				System.out.print("-"+i);
				}
			}
		}
		System.out.println("="+sum);

		for(int i=1;i<=range;i++) {
			if(i%2==0) {
				System.out.print("-"+i);
				sum2-=i;
			}
			if(i%2==1) {
				if(i==1) {
					System.out.print("2번 답 :"+i);
					sum2+=i;
				}
				else {
				System.out.print("+"+i);
				sum2+=i;
				}
			}
		}
		System.out.print("="+sum2);
	}
}
