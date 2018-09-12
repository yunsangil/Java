package ForEx1;

public class For9 {
	//8. 1부터 100까지 숫자 중에서 일의 자리 의 두배가 되는 십의 자리를 가짓 숫자를 출력하시오.
	
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
