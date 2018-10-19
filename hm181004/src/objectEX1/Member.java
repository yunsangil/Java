package objectEX1;

import java.util.Scanner;

public class Member {
	public Member() {

	}

	// ��ü�� �ȿ� �ִ� ����(�ʵ��, �޼ҵ��)�� �������� �ʴ´�. ��Ģ >> ���м�, ĸ��ȭ
	private String id = null;
	private String pwd = null;
	private Scanner in = new Scanner(System.in);
	String inputID = "0";
	String inputPWD = "0";


	// public private default(�⺻��) protected ����������,����������
	// public : ��� ��Ű������ ��� ����
	// default : ���� Ŭ���� ������ ��� ����
	// private : ���� ��Ű���� �ִ��� ���� �Ұ���. ȥ�ڼ��� ��밡��
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public boolean checkMember() {

		while (!checkLeng(inputID)) {
			System.out.println("ID �Է�");
			inputID = in.nextLine();
		}
		int checknum = 1;

		while (!checkLeng(inputPWD) && checknum <= 3) {
			System.out.println(checknum+ " ��° pwd �Է�");
			inputPWD = in.nextLine();
			checknum++;
		}
		if (checknum > 3) {
			return false;
		} else {

			setId(inputID);
			setPwd(inputPWD);
			return true;

		}
	}
	private boolean checkLeng(String r) {
		if (r.length() < 8) {
			return false;
		} else {
			return true;
		}
	}

	public void prt() {
		System.out.println("=============my info=============");
		System.out.println("==user ID :" + getId() + "=============");
		System.out.println("==user ID :" + getPwd() + "=============");
	}
	public void mod() {
		if(checkPwd())
		{
			System.out.println("���ο� ��й�ȣ �Է�>>");
			inputPWD = in.nextLine();
			if(checkLeng(inputPWD)) {
				setPwd(inputPWD);
			}
			else {
				System.out.println("��й�ȣ�� ª���ϴ�.");
			}
		}	
		else {
			System.out.println("��й�ȣ ����");
		}
	}
	public boolean checkPwd() {

		System.out.println("��й�ȣ �Է� >>");
		String inputPWD = in.nextLine();
		if(getPwd().equals(inputPWD)) {
			return true;
			
		}else {
			return false;
		}
	}

}
