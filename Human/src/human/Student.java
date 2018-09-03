package human;

public class Student extends Human 
{
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("학생 입니다.");
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
		return super.toString()+" " +major+"학과";
	}
	
	public static void main(String args[])
	{
		Student a= new Student("명진",21,"컴퓨터");
		//Student b= new Student("미현",22,"경영");
		//Student c= new Student("용준",24,"경제");
		
		System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
	}

}
