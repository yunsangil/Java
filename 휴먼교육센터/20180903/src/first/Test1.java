package first;

public class Test1 {

	//1번문제 1~9까지 홀수 출력
	//2번문제 1~9까지 짝수의 합
	//3번문제 홀수는 홀수끼리 더하고 짝수는 짝수끼리 뺀다.
	public static void main(String[] args) {	
		int sum=0;
		int sumsingle=0;
		int subtractdouble=0;
		System.out.print("1번문제 홀수 출력 :");
		for(int i=1;i<10;i++) {
			if(i%2==1) {
				if (i==9) {
					System.out.println(i);
					sumsingle+=i;
					}
				else {
				System.out.print(i+",");
				sumsingle+=i;
				}
			}
			else if(i%2==0) {
				sum+=i;
				subtractdouble-=i;
			}			
		}
		System.out.println("2번문제 짝수의 합 :"+sum);
		System.out.print("3번문제 홀수의 합 :"+sumsingle+", 짝수의 차 :"+subtractdouble);
	}
}
