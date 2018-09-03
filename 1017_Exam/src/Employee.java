
public class Employee {
	// ����
	protected String name;
	protected int salary;
	protected int age;
	
	// ������
	public Employee() {
		
	}
	public Employee(String n, int a, int s) {
		name = n;
		age = a;
		salary = s;
	}
	
	// ������ & ������
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
	
	// �޼ҵ�
	public int income(int month) {
		return salary*month;
	}
	public String toString() {
		return name+"�� ������ " + salary +"�̸�, ���̴� " + age + "���̴�.";
	}
}
