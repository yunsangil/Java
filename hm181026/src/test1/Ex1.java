package test1;

public class Ex1 {

	/*
	 * 에러 / 컴파일 시
	 * 예외 / 실행시 발생, 이때도 에러는 발생할 수 있다
	 * error : 코드에서 처리 불가능
	 * exception : 코드에서 처리는 가능하나 오류 발생한 경우, 예외
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p.422 ~ p.453
		try {
			int testEx[] = {1,2,3};
//			int k=10/0;
			char aaaa='a';
			int aaa = Integer.valueOf(aaaa);
//			System.out.println(testEx[3]);
			System.out.println(aaa);
//			System.out.println("실행되야 하는 프로그램이 있습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위 오버");
//			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌수는 없습니다ㅎㅎ");
//			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			System.out.println("문자열은 숫자로 변환안됨");
		}
		finally {
//			String aa="a";
//			System.out.println(Integer.valueOf(aa));
			System.out.println("실행되버림");
		}

	}

}
