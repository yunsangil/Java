package objectEX1;

import java.util.Scanner;

public class Member {
	public Member() {

	}

	// 객체는 안에 있는 내용(필드명, 메소드등)을 공개하지 않는다. 원칙 >> 은닉성, 캡슐화
	private String id = null;
	private String pwd = null;
	private Scanner in = new Scanner(System.in);
	String inputID = "0";
	String inputPWD = "0";


	// public private default(기본값) protected 접근제어자,접근지시자
	// public : 모든 패키지에서 사용 가능
	// default : 같은 클래스 에서만 사용 가능
	// private : 같은 패키지에 있더라도 접근 불가능. 혼자서만 사용가능
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
			System.out.println("ID 입력");
			inputID = in.nextLine();
		}
		int checknum = 1;

		while (!checkLeng(inputPWD) && checknum <= 3) {
			System.out.println(checknum+ " 번째 pwd 입력");
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
			System.out.println("새로운 비밀번호 입력>>");
			inputPWD = in.nextLine();
			if(checkLeng(inputPWD)) {
				setPwd(inputPWD);
			}
			else {
				System.out.println("비밀번호가 짧습니다.");
			}
		}	
		else {
			System.out.println("비밀번호 오류");
		}
	}
	public boolean checkPwd() {

		System.out.println("비밀번호 입력 >>");
		String inputPWD = in.nextLine();
		if(getPwd().equals(inputPWD)) {
			return true;
			
		}else {
			return false;
		}
	}

}
