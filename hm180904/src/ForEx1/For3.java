package ForEx1;
import java.util.Scanner;
public class For3 {
	//2.if만 단독으로 사용하여 홀수는 더하고 짝수는 빼기 하고 이떄 sum 변수는 하나만 사용
	//결과값은 하나의 변수에 저장
	public static void main(String[] args) {
		

		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("범위를 입력해주세요.");
		int range = in.nextInt();
		for(int i=1;i<=range;i++) {
			
			if(i%2==0) {				
				
				System.out.print("-"+i);
				sum-=i;
				continue;
			}
				System.out.print("+"+i);

				sum+=i;
		}
		System.out.println("결과값은 :"+sum+"입니다.");
	}
}
