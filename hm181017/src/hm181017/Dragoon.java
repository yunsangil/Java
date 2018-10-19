package hm181017;
//p.186 ~ 상속
public class Dragoon {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	//메소드 오버로딩(여러개의 메소드를 정의) , 오버라이딩(재정의)
	private String name=null;
	private int energy=0;
	private final int maxEnergy=100; //final 상수
	
	//변수 선언 할 때 고려해야 할 요소 접근제어자, 타입, 상수
	Dragoon(){ //메소드 중 생성자 객체가 만들어질때 처음 호출됨. 딱 한번만 호출되고 리턴 타입이 없고 접근 제어자가 있음
		
	}
	//메소드 오버로딩
	//메소드 이름은 동일, 매개변수의 수, 매개변수 타입이 다르면 오버로딩
	public Dragoon(String name, int e) { //매개변수가 있는 생성자
		// TODO Auto-generated constructor stub
		this.name = name;
		this.energy = e;
	}
	public Dragoon(String name)                  //<--메소드 오버로딩 
	{
		this.name =name;
	}
	public void prt() {
		System.out.println(this.name+"/" +this.energy+"/"+this.maxEnergy);
	}
	public void walk() { //메소드
		
	}
	
}