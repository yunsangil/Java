package ExtendsEx;

public class SubCLS extends SuperCLS {
	
	int a=10;
	
	SubCLS(){
//		System.out.println(this.a);
//		System.out.println(super.a);
//		money();
//		super();
		super.name="ȫ�浿";
	}
	SubCLS(int aa){
		this.a = aa;
	}
	@Override
	public void money() {
		System.out.println("10000��");
	}
}
