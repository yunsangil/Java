package ForEx1;

public class For2 {
	//1���� 100���� ���ϰ� ¦���� ���ϰ� Ȧ���� ����. ������� 50�� �Ѿ�� �� ���ڸ� ����ض�.
	//boolean -->true or false
	//boolean flag=false;
	public static void main(String[] args) {
		
		int sum=1;
		for(int i=1;i<100;i++) {
			
			if(i%2==1) {
				sum*=i;
			}
			else if(i%2==0) {
				sum+=i;
			}
			if(sum>50) { //if(sum>50&&!flag)
				System.out.print(i);
				i=100;
				//flag=true;
				
			}
		}
	}
}
