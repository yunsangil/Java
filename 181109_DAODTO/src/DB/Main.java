package DB;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBEx d = new DBEx();
//		d.insert();
//		DTO newD = new DTO("lee","parkpark2");
//		d.insert(newD);
		
		ArrayList<DTO> member = d.list();
		for(int i=0;i< member.size(); i++) {
			DTO m = member.get(i);
			System.out.println(i+":"+m.getId()+" / "+m.getName());
		}
			d.update();
	}
//	void menu(){
//		System.out.println
//	}

}
