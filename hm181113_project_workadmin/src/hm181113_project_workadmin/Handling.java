package hm181113_project_workadmin;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Handling {
	
	Scanner in = new Scanner(System.in);
	DAO dao = null;
	DTO dto = null;
	ArrayList <DTO> worklist = new ArrayList<>();
	ArrayList <DTO2> progresslist = new ArrayList<>();
	String [] save_token = new String[5];
	int count=0,user_select=0;
	Handling(){
		dao = new DAO();
		init();
	}
	
	void init() {
		
		Loop1 : while(true) {
			if(count ==0)
			{
			System.out.println("업무 관리 데이터베이스입니다.");
			System.out.println("명령어를 모르실 경우 /help를 입력해주세요");
			count++;
			}
			String user_input = in.nextLine();
			int index = 0;
			StringTokenizer tk = new StringTokenizer(user_input," ");
			while(tk.hasMoreTokens()) {
				save_token[index]=tk.nextToken();
				index++;
			}
			if(save_token[0].equals("/help"))
			{
				help();
			}
			else if(save_token[0].equals("/new"))
			{
				System.out.println("new 메뉴로 이동했음");
				dto = new DTO(save_token[1],save_token[2],save_token[3]); //업무명,시작날짜,종료날짜
				System.out.println(dto);
				dao.insert(dto);
			}
			else if(save_token[0].equals("/newprogress"))
			{
				DTO2 dto2 = new DTO2(save_token[1],save_token[2]);
				dao.insert_progress(dto2);
			}
			else if(save_token[0].equals("/del")) {
				System.out.println("del 메뉴로 이동했음");
				dao.delete(save_token[1]);
			}
			else if(save_token[0].equals("/view")) {
				System.out.println("view 메뉴로 이동했음");
				worklist = dao.worklist();
				System.out.println("\n업무이름/시작날짜/종료날짜/상태");
				for(int i=0;i<worklist.size();i++)
				{
					System.out.println(worklist.get(i));
				}
				System.out.println("업무를 자세히 보시겠습니까?");
				System.out.println("1.예 / 2.아니오");
				try {
				user_select=in.nextInt();
				in.nextLine();
				if(user_select ==1)
				{
					System.out.println("자세히 보고싶은 업무를 입력해주세요.");
					user_input = in.nextLine();
					
					System.out.println("입력하신 업무의 업무 내용은 다음과 같습니다.");
					progresslist = dao.progresslist(user_input);
					System.out.println("일련번호/업무명/내용");
					for(int i=0;i<progresslist.size();i++)
					{
						System.out.println(progresslist.get(i));
					}
				}
				else if(user_select ==2)
				{
					System.out.println("이전 메뉴로 돌아갑니다.");
					count--;
					continue;
				}
				}
				catch(Exception e) {
					System.out.println("잘못 입력하셨습니다!");
					continue;
				}
				
			}
			else if(save_token[0].equals("/update")) {
				System.out.println("update 메뉴로 이동했음");
				dao.update(save_token[1], save_token[2], save_token[3], save_token[4]);
			}
			else if(save_token[0].equals("/done")) {
				dao.update_statement_done(save_token[1]);
			}
			else if(save_token[0].equals("/exit")) {
				System.out.println("종료");
				return;
			}
			else {
				System.out.println("존재하지 않는 키워드 입니다.");
				count--;
			}
			System.out.println("계속 진행해주세요.");
		}
	}

	void help(){
		System.out.println("명령어는 다음과 같습니다.");
		System.out.println("/new aaa: aaa 업무 생성");
		System.out.println("/newprogress aaa bbb: aaa 업무에 대한 작업 일지 bbb 기록");
		System.out.println("/del aaa: aaa 업무 삭제");
		System.out.println("/view aaa: aaa 업무 자세히 보기");
		System.out.println("/update '테이블명' '업무명' '컬럼명' '값': 테이블 '업무'의 '컬럼' 값을 '값으로 수정");
		System.out.println("/done aaa : aaa업무 완료 처리");
		System.out.println("/exit: 종료");
	}
}
