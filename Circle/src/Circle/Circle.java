package Circle;

public class Circle {
	private double radius;
	static double PI = 3.141592;
	
	public Circle(double r)
	{
		radius = r;   //»ı¼ºÀÚ
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	public double square()
	{
		return radius*radius;
	}
	
	public double getArea()
	{
		return square()*PI;
	}
	
	public double getperimeter()
	{
		return 2*radius*PI;
	}
	static double getPI()
	{
		return PI;
	}
	

}
