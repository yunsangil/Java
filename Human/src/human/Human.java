package human;

public class Human {
	
	private String name;
	private int age;
	
	public Human(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Human ÀÔ´Ï´Ù");
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
		return "ÀÌ¸§ : "+name+" ³ªÀÌ : "+age;
	}
	public static void main(String[] args){
		
		Human h1 = new Human("ÃáÇâ",18);
		Human h2 = new Human("¸ù·æ",20);
		Human h3 = new Human("»ç¶Ç",30);
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}
