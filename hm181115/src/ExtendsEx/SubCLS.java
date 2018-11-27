package ExtendsEx;

public class SubCLS extends SuperCLS {
	
	int a=10;
	
	SubCLS(){
//		System.out.println(this.a);
//		System.out.println(super.a);
//		money();
//		super();
		super.name="È«±æµ¿";
	}
	SubCLS(int aa){
		this.a = aa;
	}
	@Override
	public void money() {
		System.out.println("10000¿ø");
	}
}
