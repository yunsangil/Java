
public class Circle {
	// 변수
	protected String owner;
	protected double radius;
	
	// 생성자
	public Circle() {
	}
	public Circle(String o) {
		owner = o;
	}
	public Circle(double r) {
		radius = r;
	}
	public Circle(String o, double r) {
		owner = o;
		radius = r;
	}
	
	// 설정자 & 접근자
	public void setOwner(String own) {
		owner = own;
	}
	public String getOwner() {
		return owner;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	
	// 메소드
	public double getArea() {
		return 3.141592*radius*radius;
	}
	public double getPerimeter() {
		return 2*3.141592*radius;
	}
}
