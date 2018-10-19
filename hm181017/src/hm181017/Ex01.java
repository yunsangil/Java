package hm181017;

public class Ex01 {
	public static int ab=10;
	public static void main(String[] args) {
		
//		Dragoon d1 = new Dragoon("DDD1",20);
//		//Dragoon d1        new        Dragoon();
//		//객체타입 참조변수 객체를 만드는 연산자   생성자
////		d1.setName("DDD1");
////		d1.setEnergy(20);
//		Dragoon d2 = new Dragoon("DDD2");
//		
//		d1.prt();
//		d2.prt();
		
		
		Cal c1 = new Cal();
		int sum1 = c1.add(20, 30);
		double sum = c1.add(10.2, 20.4);
		System.out.println(sum1);
		System.out.println(sum);
		
		Dragoon d1 = new Dragoon("DDD3",30);
//		d1.maxEnergy=200; <--final 상수로 선언했기 때문에 변경 불가능
		Dragoon d2 = new Dragoon("DDD4");
		
		d1.prt();
		d2.prt();
		ab--;
		
		
	}
}
