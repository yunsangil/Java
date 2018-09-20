package Test;

public class StringEx1 {
	public static void main(String[] args) {
		String sign = "my name is min";
		String sign1[] = new String[5];
		int a = 10;
		char b = 'c';
		for (int i = 0; i < 5; i++) {
			sign1[i] = "min";
			if (sign1[i].equals("min")) {
				System.out.println("Ãâ·ÂµÊ");
			}
		}

		System.out.println(sign.length());
		int totalcnt = 0;
		int signF=0;
		for (int i = 0; i < sign.length(); i++) {
			if (sign.charAt(signF++) == 'm') {
				totalcnt++;
			}
		}
		System.out.println(totalcnt);
	}

}
