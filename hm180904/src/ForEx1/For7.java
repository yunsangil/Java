package ForEx1;

public class For7 {
	//6. 1���� 100���� ������ 3�� ����� ������ �� ��� ����, 5�� ����� ������ �Ѱ�� ����
	//3�� ����̰ų� 5�� ����� ������ �ٷ����� +1 �Ǵ� -1�� �� �Ϳ� x2�� �Ѵ�.
	//100���� ������ ��� �� ��ܰ踦 �����ߴ°�?
	
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
		System.out.print("�ö� �� ���� :"+floor+"�� �Դϴ�.");
	}
}
