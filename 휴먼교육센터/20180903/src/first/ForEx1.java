package first;

public class ForEx1 {
	public static void main(String[] args) {
		//�ݺ���
		//while for
//		String A="*";
//		for(int a=1;a<=10;a++) {
//			System.out.println("�ݺ��� �׽�Ʈ :"+a+"��° �Դϴ�."+A);
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
//			System.out.println("�ݺ��� �׽�Ʈ �Դϴ�."+i+"���� �Դϴ�.");
//		}
//		for (int a=1; a<10; a++) {
//			if(a%2==1) {
//				System.out.println("a �ݺ��� �׽�Ʈ �Դϴ�."+a+"��° �Դϴ�.");
//			}
//			else {
//				a+=0;
//			}
//			for(int i=1; i<10; i++) {
//				System.out.println("b �ݺ��� �׽�Ʈ �Դϴ�."+i+"���� �Դϴ�.");
//				i++;
//			}
		int sum=0;
		for (int i=1; i<10; i++) {
			System.out.println("�ݺ��� �׽�Ʈ�Դϴ�."+i+"��° �Դϴ�.");
			sum = sum+i;
		}
		System.out.println("1-9������ i���� �� :"+sum);
		}
	}

