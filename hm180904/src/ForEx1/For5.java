package ForEx1;

public class For5 {
	//4. 1부터 100까지 숫자 중 3의 배수는 더하고 5의 배수는 빼고, 3의 배수이면서 5의 배수는 곱한 값을 구하시오.
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=20;i++) {

			if (i%3==0&&i%5==0) {
				sum*=i;
				System.out.println("*"+i);
			}
			else if(i%3==0) {
				sum+=i;
				System.out.println("+"+i);
			}
			else if(i%5==0) {
				sum-=i;
				System.out.println("-"+i);
			}
		}
		System.out.println("="+sum);
	}
}
