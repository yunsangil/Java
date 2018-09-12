package ForEx1;

public class For8 {
	//7. 1/1+1/2+1/3+1/5+1/6+1/7+1/8+1/9=???
	
	public static void main(String[] args) {
		
		float a=0;
		float b=1;
		float calc=0;
		for(int i=1;i<=9;i++) {
			a=i;
			if (i==1) {
			System.out.print(b+"/"+a+"+"+b+"/");
			calc+=1;
		}
			else if(i==9){
				System.out.print(a+"=");
				calc+=(1/a);
				}
			else {
				System.out.print(a+"+"+b+"/");
				calc+=(1/a);
				
			}
	}
		System.out.print(calc);
}
}
