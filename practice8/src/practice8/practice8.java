package practice8;

public class practice8 {
	public static void main(String[] args){
		
		int i;
		int sum=0;
		for(i=1;i<=100;i++){
			if(i%2==1)
			{
				continue;
			}
			else
			{
				sum = sum+i;
			}
		}
		System.out.println("1���� 100���� ¦���� ���� "+sum+"�Դϴ�.");
	}

}
