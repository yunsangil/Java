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
	
	System.out.println("입력된 수 중에서 가장 큰 수는 "+max+"입니다");
	System.out.println("입력된 수 중에서 가장 작은 수는 "+min+"입니다");
	System.out.println("입력한 수들의 평균은 "+sum/5+"입니다");
	System.out.println("가장 큰 수와 평균과의 차는 "+maxminus+"입니다");
	System.out.println("가장 작은 수와 평균과의 차는 "+minminus+"입니다");
}
	
	
}
