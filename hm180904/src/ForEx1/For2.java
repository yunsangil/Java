package ForEx1;

public class For2 {
	//1부터 100까지 더하고 짝수는 더하고 홀수는 곱함. 결과값이 50이 넘어갈때 그 숫자를 출력해라.
	//boolean -->true or false
	//boolean flag=false;
	public static void main(String[] args) {
		
		int sum=1;
		for(int i=1;i<100;i++) {
			
			if(i%2==1) {
				sum*=i;
			}
			else if(i%2==0) {
				sum+=i;
			}
			if(sum>50) { //if(sum>50&&!flag)
				System.out.print(i);
				i=100;
				//flag=true;
				
			}
		}
	}
}
