package Car;


public class cartest {
	
	public static void main(String args[]){
		
		
		Car cooper = new Car();
		
		Car mini = new Car(20,10);
		
		Car black = new Car("black",50);
		
		Car perpect = new Car(50,20,"rainbow");
		
		System.out.println("현재 차의 속도는:"+cooper.speed+"입니다");
		System.out.println("현재 차의 총 주행속도는 :"+cooper.mileage+"입니다.");
		System.out.println("현재 차의 속도는:"+mini.speed+"입니다");
		System.out.println("현재 차의 총 주행속도는 :"+mini.mileage+"입니다.");
		System.out.println("현재 차의 색깔은 "+black.color+"입니다");
		cooper.speedtest();
		
	}
}
