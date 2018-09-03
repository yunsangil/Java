package circle;

public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder()
	{
		
	}
	public Cylinder(double radius)
	{
		super(radius);
	}
	public Cylinder(double radius,double height)
	{
		super(radius);
		this.height=height;
	}
	public double getHeight()
	{
		return this.height;
	}
	
	public double getvolume()
	{
		return super.getarea()*height;
	}
	
	public static void main(String args[])
	{
		Cylinder obj1 = new Cylinder(5.0, 3.0);
		
		System.out.println("반지름 :" +obj1.getRadius());
		System.out.println("높이 :"+obj1.getHeight());
		System.out.println("원기둥의 부피는 :"+obj1.getvolume());
	}

}
