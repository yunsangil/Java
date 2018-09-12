package ForEx1;
import java.util.Scanner;
public class For13 {
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
		for(int l=1;l<=range;l++) {
			for(int n=0;n<l;n++) {
				System.out.print(" ");
			}
			for(int m=(range*2);m>=(2*l);m--) {
				System.out.print("*");
			}
			System.out.println();
		}
		range=range+1;
		for(int i=1;i<=range;i++) {
			for(int k=range;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<(2*i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	}