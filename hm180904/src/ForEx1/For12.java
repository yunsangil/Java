package ForEx1;
import java.util.Scanner;
public class For12 {
	//별 찍기
	
	//range = 몇줄을 출력할지? 받는 scanner
	//i = 줄수
	//j = 찍는 수
	//k = 공백
	//k_2= 공백 2
	//l = 역순 줄수
	//m = 역순 찍는수
	//n =역순 공백
	//n_2 = 역순 공백 2
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("줄 수를 입력하세요");
		int range=in.nextInt();
		for(int i=0;i<=range;i++) {
			int num=range/2 - Math.abs(range/2 -i);
			for(int j=0;j<num+(range-2 *num);j++) {
				if (j<num) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}
