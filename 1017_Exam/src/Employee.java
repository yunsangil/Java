
public class Employee {
	// 변수
	protected String name;
	protected int salary;
	protected int age;
	
	// 생성자
	public Employee() {
		
	}
	public Employee(String n, int a, int s) {
		name = n;
		age = a;
		salary = s;
	}
	
	// 설정자 & 접근자
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int s) {
		salary = s;
	}
	public int getSalary() {
		return salary;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	
	// 메소드
	public int income(int month) {
		return salary*month;
	}
	public String toString() {
		return name+"의 월급은 " + salary +"이며, 나이는 " + age + "살이다.";
	}
}
