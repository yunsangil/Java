package hm181017;
//p.186 ~ ���
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
	//�޼ҵ� �����ε�(�������� �޼ҵ带 ����) , �������̵�(������)
	private String name=null;
	private int energy=0;
	private final int maxEnergy=100; //final ���
	
	//���� ���� �� �� ����ؾ� �� ��� ����������, Ÿ��, ���
	Dragoon(){ //�޼ҵ� �� ������ ��ü�� ��������� ó�� ȣ���. �� �ѹ��� ȣ��ǰ� ���� Ÿ���� ���� ���� �����ڰ� ����
		
	}
	//�޼ҵ� �����ε�
	//�޼ҵ� �̸��� ����, �Ű������� ��, �Ű����� Ÿ���� �ٸ��� �����ε�
	public Dragoon(String name, int e) { //�Ű������� �ִ� ������
		// TODO Auto-generated constructor stub
		this.name = name;
		this.energy = e;
	}
	public Dragoon(String name)                  //<--�޼ҵ� �����ε� 
	{
		this.name =name;
	}
	public void prt() {
		System.out.println(this.name+"/" +this.energy+"/"+this.maxEnergy);
	}
	public void walk() { //�޼ҵ�
		
	}
	
}