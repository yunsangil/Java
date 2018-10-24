package business_log_Administration;

import java.util.ArrayList;

public class listOf_business_log {
	
	public static boolean flag = false;
	
	public static void listOf_b_log(ArrayList <business_log> b_log) {
		
		flag=false; //메소드 호출때 마다 flag값을 false로 초기화
		for(int i=0;i<b_log.size();i++)
		{
			System.out.println("업무 번호 :"+b_log.get(i).getWorkNum());
			System.out.println("업무 시작일 :"+b_log.get(i));
			System.out.println("업무명 :"+b_log.get(i).getWork());
			System.out.println("업무 만료일 :"+b_log.get(i).toString2());
			System.out.println();
			flag = true;
		}
		
		if(flag==false) //flag가 false일 경우는 위의 for문이 실행이 안될 경우 뿐이므로
		{
			System.out.println("업무 일지 목록이 비었습니다!");
			System.out.println();
		}
	}
}
