package practice9;
import java.util.Scanner;
public class practice9 {
public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	int intArray[]=new int[5];
	int max =0;
	int min=100000;
	
	int sum=0;
	int maxminus=0;
	int minminus=0;
	for(int i=0;i<5;i++){
		intArray[i]=in.nextInt();

		sum+=intArray[i];
		if(intArray[i]>max){
			max = intArray[i];
		}
		if(intArray[i]<min){
			
			min = intArray[i];
		}
		
	}
	maxminus=max-sum/5;
	minminus=sum/5-min;
	
	System.out.println("�Էµ� �� �߿��� ���� ū ���� "+max+"�Դϴ�");
	System.out.println("�Էµ� �� �߿��� ���� ���� ���� "+min+"�Դϴ�");
	System.out.println("�Է��� ������ ����� "+sum/5+"�Դϴ�");
	System.out.println("���� ū ���� ��հ��� ���� "+maxminus+"�Դϴ�");
	System.out.println("���� ���� ���� ��հ��� ���� "+minminus+"�Դϴ�");
}
	
	
}
