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
			System.out.println("���� ���� �����ͺ��̽��Դϴ�.");
			System.out.println("��ɾ �𸣽� ��� /help�� �Է����ּ���");
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
				System.out.println("new �޴��� �̵�����");
				dto = new DTO(save_token[1],save_token[2],save_token[3]); //������,���۳�¥,���ᳯ¥
				System.out.println(dto);
				dao.insert(dto);
			}
			else if(save_token[0].equals("/newprogress"))
			{
				DTO2 dto2 = new DTO2(save_token[1],save_token[2]);
				dao.insert_progress(dto2);
			}
			else if(save_token[0].equals("/del")) {
				System.out.println("del �޴��� �̵�����");
				dao.delete(save_token[1]);
			}
			else if(save_token[0].equals("/view")) {
				System.out.println("view �޴��� �̵�����");
				worklist = dao.worklist();
				System.out.println("\n�����̸�/���۳�¥/���ᳯ¥/����");
				for(int i=0;i<worklist.size();i++)
				{
					System.out.println(worklist.get(i));
				}
				System.out.println("������ �ڼ��� ���ðڽ��ϱ�?");
				System.out.println("1.�� / 2.�ƴϿ�");
				try {
				user_select=in.nextInt();
				in.nextLine();
				if(user_select ==1)
				{
					System.out.println("�ڼ��� ������� ������ �Է����ּ���.");
					user_input = in.nextLine();
					
					System.out.println("�Է��Ͻ� ������ ���� ������ ������ �����ϴ�.");
					progresslist = dao.progresslist(user_input);
					System.out.println("�Ϸù�ȣ/������/����");
					for(int i=0;i<progresslist.size();i++)
					{
						System.out.println(progresslist.get(i));
					}
				}
				else if(user_select ==2)
				{
					System.out.println("���� �޴��� ���ư��ϴ�.");
					count--;
					continue;
				}
				}
				catch(Exception e) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�!");
					continue;
				}
				
			}
			else if(save_token[0].equals("/update")) {
				System.out.println("update �޴��� �̵�����");
				dao.update(save_token[1], save_token[2], save_token[3], save_token[4]);
			}
			else if(save_token[0].equals("/done")) {
				dao.update_statement_done(save_token[1]);
			}
			else if(save_token[0].equals("/exit")) {
				System.out.println("����");
				return;
			}
			else {
				System.out.println("�������� �ʴ� Ű���� �Դϴ�.");
				count--;
			}
			System.out.println("��� �������ּ���.");
		}
	}

	void help(){
		System.out.println("��ɾ�� ������ �����ϴ�.");
		System.out.println("/new aaa: aaa ���� ����");
		System.out.println("/newprogress aaa bbb: aaa ������ ���� �۾� ���� bbb ���");
		System.out.println("/del aaa: aaa ���� ����");
		System.out.println("/view aaa: aaa ���� �ڼ��� ����");
		System.out.println("/update '���̺��' '������' '�÷���' '��': ���̺� '����'�� '�÷�' ���� '������ ����");
		System.out.println("/done aaa : aaa���� �Ϸ� ó��");
		System.out.println("/exit: ����");
	}
}
