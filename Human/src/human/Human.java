package human;

public class Human {
	
	private String name;
	private int age;
	
	public Human(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Human �Դϴ�");
	}
	public String getname()
	{
		return this.name;
	}
	public int getage()
	{
		return this.age;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	
	public String toString()
	{
		return "�̸� : "+name+" ���� : "+age;
	}
	public static void main(String[] args){
		
		Human h1 = new Human("����",18);
		Human h2 = new Human("����",20);
		Human h3 = new Human("���",30);
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}
