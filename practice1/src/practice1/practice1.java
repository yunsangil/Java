package practice1;
import java.util.Scanner;

public class practice1 {
	public static void main(String[] args){
		
		
		char grade;
		Scanner a = new Scanner(System.in);
		
		while(a.hasNext()){
			int score=a.nextInt();
			
		switch(score/10){
		case 10:
		case 9:
			grade='A';
		    break;
		case 8:
			grade ='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
			
		default:
			grade='F';
		}
			
			switch(grade){
			case 'A':
			case 'B':
			System.out.println("�� ���Ͽ����ϴ�.");
			break;
			case 'C':
			case 'D':
			System.out.println("�� �� ����ϼ���.");
			break;
			case 'F':
			System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
			break;
			default:
			System.out.println("�߸��� �����Դϴ�.");
		}
	}
	}
}

