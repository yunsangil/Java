package human;

public class Student extends Human 
{
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("�л� �Դϴ�.");
	}
	
	public String getmajor()
	{
		return this.major;
	}
	public void setmajor(String major)
	{
		this.major=major;
	}
	
	public String toString()
	{
		return super.toString()+" " +major+"�а�";
	}
	
	public static void main(String args[])
	{
		Student a= new Student("����",21,"��ǻ��");
		//Student b= new Student("����",22,"�濵");
		//Student c= new Student("����",24,"����");
		
		System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
	}

}
