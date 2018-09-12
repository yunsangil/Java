package ForEx1;

public class For7 {
	//6. 1부터 100까지 숫자중 3의 배수를 만나면 한 계단 전진, 5의 배수를 만나면 한계단 후진
	//3의 배수이거나 5의 배수를 만나면 바로전에 +1 또는 -1에 한 것에 x2를 한다.
	//100까지 수행한 경우 총 몇단계를 전진했는가?
	
	public static void main(String[] args) {
		
		int floor=0;
		boolean check=false;
		for(int i=1;i<=100;i++) {

			if(i%3==0&&i%5==0&&check==true) {
				
				floor++;
				floor++;
				
			}
			else if(i%3==0&&i%5==0&&check==false) {
				floor--;
				floor--;
			}
			
			else if (i%3==0) {
				floor++;
				check=true;
				
			}
			else if (i%5==0) {
				floor--;
				check=false;
			}

		}
		System.out.print("올라간 층 수는 :"+floor+"층 입니다.");
	}
}
