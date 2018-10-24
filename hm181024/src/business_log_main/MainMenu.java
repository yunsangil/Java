package business_log_main;

import java.util.GregorianCalendar;
import java.util.Scanner;

import business_log_Administration.Handling_business_log;
import business_log_Document.Add_Work_Content;
import business_log_Document.Handling_Work_Content;
import business_log_Document.Show_Work_Content;

public class MainMenu {

	private boolean flag = true;
	private Handling_business_log HB = null;
	private Handling_Work_Content HWC = null;
	private Scanner in = new Scanner(System.in);

	public MainMenu() {
		setOBJ();
		inits();
	}

	private void setOBJ() {
		HB = new Handling_business_log();
		HWC = new Handling_Work_Content(HB);
	}

	void inits() {
		while (flag) {
			int input_select = 0;
			menu();
			input_select = in.nextInt();
			in.nextLine();
			switch (input_select) {
			case 1:
				System.out.println("���� ���� �ۼ� �޴��Դϴ�.");
				HB.init();
				break;
			case 2:
				HWC.init2();
				break;
			case 3:
				todays_work();
				break;
			case 4:
				System.out.println("�����մϴ�.");
				flag = false;
				return;
			}
		}
	}

	void menu() {
		System.out.println("1.�������� ����");
		System.out.println("2.���� ���� ����");
		System.out.println("3.������ ���� ��ȸ");
		System.out.println("4.����");
	}

	void todays_work() {

		GregorianCalendar today = new GregorianCalendar();

		int year = today.get(today.YEAR) -2000;

		int month = today.get(today.MONTH) + 1;

		int date = today.get(today.DATE);
		
		int today_is = (year * 365) +  (month * 30) + date;
		
		int searched_index;
		boolean flag2=false;

		System.out.println(year+"��"+month+"��"+date+"�� ������ ������ ��ȸ�մϴ�.");
		
		for(int i=0;i<HB.create_b_log.b_log.size();i++)
		{
			int startday = HB.create_b_log.b_log.get(i).getLog_day();
			int startmonth = HB.create_b_log.b_log.get(i).getLog_month(); 
			int startyear = HB.create_b_log.b_log.get(i).getLog_year();
			
			int start = startday + (startmonth * 30) + (startyear * 365);
			
			int limitday = HB.create_b_log.b_log.get(i).getLimit_day();
			int limitmonth = HB.create_b_log.b_log.get(i).getLimit_month();
			int limityear = HB.create_b_log.b_log.get(i).getLimit_year();
			
			int limit = limitday + (limitmonth * 30) + (limityear * 365);
		
			if(start<today_is && today_is<limit)
			{
				searched_index=i;
				System.out.println(HB.create_b_log.b_log.get(searched_index).toString4()+"�� �ֽ��ϴ�.");
				System.out.println("���� �ϼ��� "+(limit - today_is)+"�� �Դϴ� !");
				flag2=true;
				
			}
		}
		if(flag2==false)
		{
			System.out.println("������ ������ �����ϴ�.");
		}
		
		

	}
}
