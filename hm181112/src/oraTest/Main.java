package oraTest;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Driver 등록 v
		 * oracle 접속 환경 설정
		 * DAO 를 통한 DB ACCESS 
		 * 
		 */
		MDAO m = new MDAO();
		m.connect();
		m.delete();
//		md.setId("t");
//		md.setName("tname");
//		md.setTel("ttel");
//		md.setAddr("taddr");
////		m.insert(md);
//		
//		md.setName("newName");
//		m.update(md);
		ArrayList<MDTO> list = new ArrayList<>();
		for(int i=0;i<100;i++)
		{
			MDTO md = new MDTO();
			md.setId(i+"id");
			md.setName(i+"name");
			md.setTel(i+"tel");
			md.setAddr(i+"addr");
			list.add(md);
		}
		m.insert(list);
		list=m.getList();
		System.out.println("id/name/tel/addr\n==================");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
