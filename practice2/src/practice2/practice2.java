package practice2;

import java.util.Scanner;

public class practice2 {
	
	public static void main(String[] args){
		

	Scanner in = new Scanner(System.in);
	System.out.println("���� ���� �� �����Դϴ�. ����,����,�� �߿��� �Է��ϼ���");
	System.out.println("������� ö��,���� �Դϴ�.");
	while (in.hasNext()){
	String var=in.next();
	String var2=in.next();

	System.out.println("ö�� >>"+var+"");
	System.out.println("����>>"+var2+"");
	
	if(var.equals("����")){
		if(var2.equals("����")){
			System.out.println("�����ϴ�.");
		}
			else if(var2.equals("����"))
			{
				System.out.println("���� �̰���ϴ�.");
			}
			else if(var2.equals("��"))
			{
				System.out.println("ö���� �̰���ϴ�.");
			}
		}
		else if(var.equals("����")){
			if(var2.equals("����"))
			{
				System.out.println("ö���� �̰���ϴ�.");
			}
			else if(var2.equals("����"))
			{
				System.out.println("�����ϴ�.");
			}
			else if(var2.equals("��"))
			{
				System.out.println("���� �̰���ϴ�.");
			}
		}
		else if(var.equals("��")){
			if(var2.equals("����"))
			{
				System.out.println("���� �̰���ϴ�.");
			}
			else if(var2.equals("����"))
			{
				System.out.println("ö���� �̰���ϴ�.");
			}
			else if(var2.equals("��"))
			{
				System.out.println("�����ϴ�.");
			}
		}
	}
}
}
