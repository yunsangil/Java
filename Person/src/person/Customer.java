package person;

public class Customer extends Person {
	
	private int customernumber;
	private int mileage;
	
	public Customer(String name, String address, String phonenumber,int customernumber,int mileage) {
		super(name, address, phonenumber);
		this.customernumber=customernumber;
		this.mileage=mileage;
	}
	public Customer(String name,String address, String phonenumber)
	{
		super(name,address,phonenumber);
	}
	
	public int getcustomernumber()
	{
		return this.customernumber;
	}
	public int getmileage()
	{
		return this.mileage;
	}
	public void setcustomernumber(int customernumber)
	{
		this.customernumber=customernumber;
	}
	public void setmileage(int mileage)
	{
		this.mileage=mileage;
	}
	public String toString()
	{
		return super.toString()+ " 회원번호: "+customernumber+" 마일리지 "+mileage;
	}
}
