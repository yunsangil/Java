
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("김수현", 20, 500);
		
		System.out.println(e1);
		System.out.println("10월달치의 월급은 " + e1.income(10) + "이다!");
	}
}
