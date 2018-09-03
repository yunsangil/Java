package Circle;

public class Circletest {
	
	
	public static void main(String args[])
	{
		Circle test = new Circle(5.0);
		
		System.out.println("원의 넓이는 :" +test.getArea());
		System.out.println("원의 둘레는 : "+test.getperimeter());
		System.out.println(+test.getPI());
		
	}
}
