package circle;

public class Circle {
	private double radius;
	private String color;
	
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	public double getarea()
	{
		return radius*radius*3.14;
	}


}
