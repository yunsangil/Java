package aaaaa;

import java.util.Scanner;

public class aaaaa {
	
	public static void main(String[] args){
		
		Student ������;
		������ = new Student();
		������.name = "������";
		������.korean = 100;
		������.english = 90;
		������.computer = 98;
		
		printStudentinfo(������);
		Studentadd(������);
		Studentdiv(Studentadd(������));
		
	}
	public static void printStudentinfo(Student student){
		
		System.out.println("�л� �̸� : " + student.name);
		System.out.println("���� ���� : "+student.korean);
		System.out.println("���� ���� : "+student.english);
		System.out.println("��ǻ�� ���� : "+student.computer);
		}
	
	public static double Studentadd(Student student){
		
		return student.korean + student.english +student.computer;
	}
	public static void Studentdiv(double a){
	
		System.out.println("���� : "+a);
		System.out.println("��� : "+a/3);
	}
	
}


class Student{
	
	String name;
	double korean;
	double english;
	double computer;
	

	
	Student(){
		
		name = "�ƹ���";
		korean = 0;
		english = 0;
		computer = 0;
	}

	Student(String name, double korean, double english, double computer){
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.computer = computer;
	}
}