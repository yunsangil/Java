package test1;

public class Ex1 {

	/*
	 * ���� / ������ ��
	 * ���� / ����� �߻�, �̶��� ������ �߻��� �� �ִ�
	 * error : �ڵ忡�� ó�� �Ұ���
	 * exception : �ڵ忡�� ó���� �����ϳ� ���� �߻��� ���, ����
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
//			System.out.println("����Ǿ� �ϴ� ���α׷��� �ֽ��ϴ�.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ���� ����");
//			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("0���� �������� �����ϴ٤���");
//			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			System.out.println("���ڿ��� ���ڷ� ��ȯ�ȵ�");
		}
		finally {
//			String aa="a";
//			System.out.println(Integer.valueOf(aa));
			System.out.println("����ǹ���");
		}

	}

}
