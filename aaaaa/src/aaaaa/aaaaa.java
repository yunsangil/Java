package aaaaa;

import java.util.Scanner;

public class aaaaa {
	
	public static void main(String[] args){
		
		Student À±»óÀÏ;
		À±»óÀÏ = new Student();
		À±»óÀÏ.name = "À±»óÀÏ";
		À±»óÀÏ.korean = 100;
		À±»óÀÏ.english = 90;
		À±»óÀÏ.computer = 98;
		
		printStudentinfo(À±»óÀÏ);
		Studentadd(À±»óÀÏ);
		Studentdiv(Studentadd(À±»óÀÏ));
		
	}
	public static void printStudentinfo(Student student){
		
		System.out.println("ÇĞ»ı ÀÌ¸§ : " + student.name);
		System.out.println("±¹¾î Á¡¼ö : "+student.korean);
		System.out.println("¿µ¾î Á¡¼ö : "+student.english);
		System.out.println("ÄÄÇ»ÅÍ Á¡¼ö : "+student.computer);
		}
	
	public static double Studentadd(Student student){
		
		return student.korean + student.english +student.computer;
	}
	public static void Studentdiv(double a){
	
		System.out.println("ÃÑÁ¡ : "+a);
		System.out.println("Æò±Õ : "+a/3);
	}
	
}


class Student{
	
	String name;
	double korean;
	double english;
	double computer;
	

	
	Student(){
		
		name = "¾Æ¹«°³";
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