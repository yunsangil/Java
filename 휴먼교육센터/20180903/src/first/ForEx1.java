package first;

public class ForEx1 {
	public static void main(String[] args) {
		//반복문
		//while for
//		String A="*";
//		for(int a=1;a<=10;a++) {
//			System.out.println("반복문 테스트 :"+a+"번째 입니다."+A);
//			A+="*";
//		}
//		for(int a=1;a<=10;a++) {
//			if (a==1) {
//			System.out.println("*");
//			}
//			else {
//				System.out.print("*");
//			}
//			for(int b=1;b<=10;b++) {
//			System.out.print("*");
//		}
//	}
//	}i=i+2-->i+=2
//		for(int i=1; i<10; i+=2) {
//			System.out.println("반복문 테스트 입니다."+i+"번쨰 입니다.");
//		}
//		for (int a=1; a<10; a++) {
//			if(a%2==1) {
//				System.out.println("a 반복문 테스트 입니다."+a+"번째 입니다.");
//			}
//			else {
//				a+=0;
//			}
//			for(int i=1; i<10; i++) {
//				System.out.println("b 반복문 테스트 입니다."+i+"번쨰 입니다.");
//				i++;
//			}
		int sum=0;
		for (int i=1; i<10; i++) {
			System.out.println("반복문 테스트입니다."+i+"번째 입니다.");
			sum = sum+i;
		}
		System.out.println("1-9까지의 i값의 합 :"+sum);
		}
	}

