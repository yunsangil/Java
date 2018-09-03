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
		
		System.out.println("������ :" +obj1.getRadius());
		System.out.println("���� :"+obj1.getHeight());
		System.out.println("������� ���Ǵ� :"+obj1.getvolume());
	}

}
