package first;

public class Test1 {

	//1������ 1~9���� Ȧ�� ���
	//2������ 1~9���� ¦���� ��
	//3������ Ȧ���� Ȧ������ ���ϰ� ¦���� ¦������ ����.
	public static void main(String[] args) {	
		int sum=0;
		int sumsingle=0;
		int subtractdouble=0;
		System.out.print("1������ Ȧ�� ��� :");
		for(int i=1;i<10;i++) {
			if(i%2==1) {
				if (i==9) {
					System.out.println(i);
					sumsingle+=i;
					}
				else {
				System.out.print(i+",");
				sumsingle+=i;
				}
			}
			else if(i%2==0) {
				sum+=i;
				subtractdouble-=i;
			}			
		}
		System.out.println("2������ ¦���� �� :"+sum);
		System.out.print("3������ Ȧ���� �� :"+sumsingle+", ¦���� �� :"+subtractdouble);
	}
}
