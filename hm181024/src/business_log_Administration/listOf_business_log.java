package business_log_Administration;

import java.util.ArrayList;

public class listOf_business_log {
	
	public static boolean flag = false;
	
	public static void listOf_b_log(ArrayList <business_log> b_log) {
		
		flag=false; //�޼ҵ� ȣ�⶧ ���� flag���� false�� �ʱ�ȭ
		for(int i=0;i<b_log.size();i++)
		{
			System.out.println("���� ��ȣ :"+b_log.get(i).getWorkNum());
			System.out.println("���� ������ :"+b_log.get(i));
			System.out.println("������ :"+b_log.get(i).getWork());
			System.out.println("���� ������ :"+b_log.get(i).toString2());
			System.out.println();
			flag = true;
		}
		
		if(flag==false) //flag�� false�� ���� ���� for���� ������ �ȵ� ��� ���̹Ƿ�
		{
			System.out.println("���� ���� ����� ������ϴ�!");
			System.out.println();
		}
	}
}
