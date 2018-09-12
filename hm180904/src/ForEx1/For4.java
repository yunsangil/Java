package ForEx1;

public class For4 {
	// 3. 100부터 0까지 숫자를 차례대로 검색하여 
	//99 88 77 같이 일의 자리와 십의 자리가 같은 숫자를 출력하되 일의 자리는 검색하지 마시오
	public static void main(String[] args) {

		int dix, units;
		for (int i = 0; i <= 100; i++) {
			dix = i / 10 % 10;
			units = i % 10;

			if (dix == units) {
				if (i == 0 || i == 100) {
					System.out.print("");
				} else {
					System.out.println(i);
				}
			}
		}
	}
}
