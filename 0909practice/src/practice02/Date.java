package practice02;

public class Date {
	
	int year,Month,date;
	
	public int getYear(){
		
		return this.year;
	}
	public int getMonth(){
		
		return this.Month;
	}
	public int getDate(){
		
		return this.date;
	}
	public void setYear(){
		
		this.year = year;
	}
	public void setMonth(){
		
		this.Month = Month;
	}
	public void setDate(){
		
		this.date=date;
	}
	public Date()
	{
		year=2016;
		Month=10;
		date=1;
	}
	public Date(int d)
	{
		year=2016;
		Month=10;
		date = d;
	}
	public Date(int m,int d)
	{
		year=2016;
		Month = m;
		date = d;
	}
	public Date(int y,int m,int d)
	{
		year = y;
		Month = m;
		date = d;
	}
	public String toString(){
		
		return year+"³â "+Month+"¿ù "+date+"ÀÏ";
	}
	public void print1()
	{
		System.out.println(year+"."+Month+"."+date);
	}
	public void print2()
	{
		String M = null;
		
		if(Month==1)
		{
			M="January";
		}
		else if(Month==2)
		{
			M="February";
		}
		else if(Month==3)
		{
			M="March";
		}
		else if(Month==4)
		{
			M="April";
		}
		else if(Month==5)
		{
			M="May";
		}
		else if(Month==6)
		{
			M="June";
		}
		else if(Month==7)
		{
			M="July";
		}
		else if(Month==8)
		{
			M="August";
		}
		else if(Month==9)
		{
			M="September";
		}
		else if(Month==10)
		{
			M="Ouctober";
		}
		else if(Month==11)
		{
			M="November";
		}
		else if(Month==12)
		{
			M="December";
		}
		System.out.println(M+" "+date+","+" "+year);
	}

}
