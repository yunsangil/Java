package ExtendsEx;

public class SubCLS1 extends SuperCLS{
	int a=10;
	
	SubCLS1(){
//		System.out.println(this.a);
//		money();
		super.name="일지매";
	}
	SubCLS1(int aa){
		this.a = aa;
	}
	@Override
	public void money() {
		System.out.println("20000원");
	}
}
