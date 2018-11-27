package ExtendsEx;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<SuperCLS> list = new ArrayList<>();
		SuperCLS s = new SubCLS();
		list.add(s);
		SuperCLS s1 = new SubCLS1();
		list.add(s1);
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) instanceof SubCLS) {
				System.out.println("subcls");
			}
			else if(list.get(i) instanceof SubCLS1) {
				System.out.println("subcls1");
			}
			list.get(i).prt();
		}
	}

}
