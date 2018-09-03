package Practice03;

import java.util.Scanner;

public class Practice03 {
	
	public static void main(String args[]){
		
		String name;
		double korean=0;
		double english=0;
		double computer=0;
		Student student = new Student();
		Scanner input = new Scanner(System.in);

		System.out.println("학생 성적 처리 프로그램입니다. 이름을 입력하세요.");
		name = input.nextLine();
		System.out.println("국어 성적을 입력하세요.");
		korean = input.nextDouble();
		System.out.println("영어 성적을 입력하세요.");
		english = input.nextDouble();
		System.out.println("컴퓨터 성적을 입력하세요.");
		computer = input.nextDouble();
		Student.setkorean(student,korean);
		Student.setenglish(student, english);
		Student.setcomputer(student, computer);
		
		System.out.println("다음은 "+name+" 학생의 성적 입력 결과를 토대로 나온 결과입니다");
		System.out.println("국어 : "+Student.getkorean(student));
		System.out.println("영어:" +Student.getenglish(student));
		System.out.println("컴퓨터:"+Student.getcomputer(student));
		System.out.println("총점:"+Student.sum(student));
		System.out.println("평균:"+Student.avg(student));
		}

		
	}


class Student{
	String name;
	double sum = 0;
	double korean=0;
	double english=0;
	double computer=0;
		


	public static double getkorean(Student student)
	{
		return student.korean;
	}
	public static double getenglish(Student student)
	{
		return student.english;
	}
	public static double getcomputer(Student student)
	{
		return student.computer;
	}
	public static void setkorean(Student student, double korean)
	{
		student.korean=korean;
	}
	public static void setenglish(Student student, double english)
	{
		student.english=english;
	}
	public static void setcomputer(Student student, double computer)
	{
		student.computer=computer;
	}
	public static double sum(Student student)
	{
		return student.korean+student.english+student.computer;
	}
	public static double avg(Student student)
	{
		return Student.sum(student)/3;
	}
}
	
	
	/*public void prt{

		Scanner input = new Scanner(System.in);
		static String name1;
		double sum1 = 0;
		static double korean1=0;
		static double english1=0;
		static double computer1=0;
		
		static Student student = new Student();
			
		public static void main(String args[]){
		System.out.println("학생 성적 처리 프로그램입니다. 이름을 입력하세요.");
		name1 = input.nextLine();
		System.out.println("국어 성적을 입력하세요.");
		korean1 = input.nextDouble();
		System.out.println("영어 성적을 입력하세요.");
		english1 = input.nextDouble();
		System.out.println("컴퓨터 성적을 입력하세요.");
		computer1 = input.nextDouble();
		Student.setkorean(student,korean1);
		Student.setenglish(student, english1);
		Student.setcomputer(student, computer1);
		
		System.out.println("다음은 "+name1+" 학생의 성적 입력 결과를 토대로 나온 결과입니다");
		System.out.println("국어 : "+Student.getkorean(student));
		System.out.println("영어:" +Student.getenglish(student));
		System.out.println("컴퓨터:"+Student.getcomputer(student));
		System.out.println("총점:"+Student.sum(student));
		System.out.println("평균:"+Student.avg(student));
		}

}*/

/*class arraystudent{
	int how;
	
	public void set() {
		
		Scanner many = new Scanner(System.in);
		
		System.out.println("몇명을 계산하시겠습니까?");
		how = many.nextInt();
		
		Student stu = new Student();
		
		for(int i=0;i<how;i++)
		{
		Student.prt();
		}
	}

}*/
