package hm20180914;

public class Test1 {
	public static void main(String[] args) {
		int a=66;
		char b=65;
		a++;
		System.out.println(a);
		b++;
		System.out.println(b); //아스키 코드 49번이 1이라서 1이 출력
		
		System.out.println((char)a); //캐스팅 연산, 형 변환, 임시적으로 char 형으로 출력
	}

}
