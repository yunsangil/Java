package ForEx1;

public class For9 {
	//8. 1���� 100���� ���� �߿��� ���� �ڸ� �� �ι谡 �Ǵ� ���� �ڸ��� ���� ���ڸ� ����Ͻÿ�.
	
	public static void main(String[] args) {
		
		int dix,units;
		for (int i=1;i<100;i++) {
			dix = i/10%10;
			units =i%10;
			
			if ((dix*2)==units){
				System.out.println(i);
			}
		}
	}

	}
