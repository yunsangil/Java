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

		System.out.println("�л� ���� ó�� ���α׷��Դϴ�. �̸��� �Է��ϼ���.");
		name = input.nextLine();
		System.out.println("���� ������ �Է��ϼ���.");
		korean = input.nextDouble();
		System.out.println("���� ������ �Է��ϼ���.");
		english = input.nextDouble();
		System.out.println("��ǻ�� ������ �Է��ϼ���.");
		computer = input.nextDouble();
		Student.setkorean(student,korean);
		Student.setenglish(student, english);
		Student.setcomputer(student, computer);
		
		System.out.println("������ "+name+" �л��� ���� �Է� ����� ���� ���� ����Դϴ�");
		System.out.println("���� : "+Student.getkorean(student));
		System.out.println("����:" +Student.getenglish(student));
		System.out.println("��ǻ��:"+Student.getcomputer(student));
		System.out.println("����:"+Student.sum(student));
		System.out.println("���:"+Student.avg(student));
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
		System.out.println("�л� ���� ó�� ���α׷��Դϴ�. �̸��� �Է��ϼ���.");
		name1 = input.nextLine();
		System.out.println("���� ������ �Է��ϼ���.");
		korean1 = input.nextDouble();
		System.out.println("���� ������ �Է��ϼ���.");
		english1 = input.nextDouble();
		System.out.println("��ǻ�� ������ �Է��ϼ���.");
		computer1 = input.nextDouble();
		Student.setkorean(student,korean1);
		Student.setenglish(student, english1);
		Student.setcomputer(student, computer1);
		
		System.out.println("������ "+name1+" �л��� ���� �Է� ����� ���� ���� ����Դϴ�");
		System.out.println("���� : "+Student.getkorean(student));
		System.out.println("����:" +Student.getenglish(student));
		System.out.println("��ǻ��:"+Student.getcomputer(student));
		System.out.println("����:"+Student.sum(student));
		System.out.println("���:"+Student.avg(student));
		}

}*/

/*class arraystudent{
	int how;
	
	public void set() {
		
		Scanner many = new Scanner(System.in);
		
		System.out.println("����� ����Ͻðڽ��ϱ�?");
		how = many.nextInt();
		
		Student stu = new Student();
		
		for(int i=0;i<how;i++)
		{
		Student.prt();
		}
	}

}*/
