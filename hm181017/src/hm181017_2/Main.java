package hm181017_2;

import TTTTest.Member;
//클래스 : 설계도
//객체 : 설계도로 만든 무언가
//프로젝트(패키지(클래스(메소드)))
public class Main {
//접근제어자
	//public / private / default
	//어디서든 /  해당되는 클래스 / 패키지 내에서
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Member m1 = new Member();
//		m1.name="kkk";
//		Member m2 = new Member();
//		m2.name="lll";
//		m2.c="2Class";
//		m2.c="2class";
		
		
//		System.out.println(m1.name+"/"+m1.c);
//		System.out.println(m2.name+"/"+m2.c);
		Member m3 = new Member(1);
		Member m4 = new Member(2);
		
		System.out.println(m3.getValue());
		System.out.println(m4.getValue());
	}

}
