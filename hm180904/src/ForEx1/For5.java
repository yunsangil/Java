package ForEx1;

public class For5 {
	//4. 1���� 100���� ���� �� 3�� ����� ���ϰ� 5�� ����� ����, 3�� ����̸鼭 5�� ����� ���� ���� ���Ͻÿ�.
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=20;i++) {

			if (i%3==0&&i%5==0) {
				sum*=i;
				System.out.println("*"+i);
			}
			else if(i%3==0) {
				sum+=i;
				System.out.println("+"+i);
			}
			else if(i%5==0) {
				sum-=i;
				System.out.println("-"+i);
			}
		}
		System.out.println("="+sum);
	}
}
