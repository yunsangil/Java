package Car;


public class cartest {
	
	public static void main(String args[]){
		
		
		Car cooper = new Car();
		
		Car mini = new Car(20,10);
		
		Car black = new Car("black",50);
		
		Car perpect = new Car(50,20,"rainbow");
		
		System.out.println("���� ���� �ӵ���:"+cooper.speed+"�Դϴ�");
		System.out.println("���� ���� �� ����ӵ��� :"+cooper.mileage+"�Դϴ�.");
		System.out.println("���� ���� �ӵ���:"+mini.speed+"�Դϴ�");
		System.out.println("���� ���� �� ����ӵ��� :"+mini.mileage+"�Դϴ�.");
		System.out.println("���� ���� ������ "+black.color+"�Դϴ�");
		cooper.speedtest();
		
	}
}
