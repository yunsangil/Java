package practice3;

public class practice3 {
	public static void main(String[] args){
		
		int i,j;
		
		for(j=1,i=3;i<50;i+=3)
		{
			j= (j * i);
			System.out.print(i);
			if(i==48){
				System.out.print("=");
				System.out.print(j);
			}
			else
				System.out.print("*");
		}
	}

}
