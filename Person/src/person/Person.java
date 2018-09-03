package person;

public class Person {
	
	private String name;
	private String address;
	private String phonenumber;
	
	public Person(String name,String address,String phonenumber)
	{
		this.name=name;
		this.address=address;
		this.phonenumber=phonenumber;
	}
	
	public String getname()
	{
		return this.name;
	}
	public String getaddress()
	{
		return this.address;
	}
	public String getphonenumber()
	{
		return this.phonenumber;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public void setphonenumber(String phonenumber)
	{
		this.phonenumber=phonenumber;
	}
	public String toString()
	{
		return "이름 : " + name + " 주소: "+"전화번호: "+phonenumber;
	}
	
	

}
