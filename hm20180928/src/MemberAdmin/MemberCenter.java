package MemberAdmin;

import java.util.Scanner;
//삭제 수정 정보보기
public class MemberCenter {
	Scanner in = new Scanner(System.in);
	Member[] myMember = new Member[100];
	Member newMember = null;

	MemberCenter() {
		boolean flag = true;
		while (flag) {
			menu();
			System.out.println("메뉴 선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			switch (selNum) {
			case 1:
				add();
				break;
			case 2:
				del();
				break;
			case 3:
				mod();
				break;
			case 4:
				list();
				break;
			case 5:
				flag = false;
				System.out.println("종료 됩니다.");
				break;
				
			default:
				System.out.println("1부터 3까지만 입력해주세요.");

			}
		}
	}

	public void menu() {
		System.out.println("1.add");
		System.out.println("2.del");
		System.out.println("3.mod");
		System.out.println("4.list");
		System.out.println("5.exit");
	}
	public void add() {
		newMember = new Member();
		System.out.println("ID를 입력하세요");
		newMember.id=in.nextLine();
		System.out.println("패스워드를 입력하세요");
		newMember.pwd=in.nextLine();
		
		for(int i=0; i<myMember.length;i++) {
			if(myMember[i]==null)
			{
				myMember[i]=newMember;
				break;
			}
		}
	}
	public void del() {

	}
	public void mod() {
		
	}
	public void list() {
		for(int i=0; i<myMember.length;i++) {
			if(myMember[i]!=null)
			{
				System.out.println(myMember[i].id+"/"+myMember[i].pwd);
			}
		}
	}
}
