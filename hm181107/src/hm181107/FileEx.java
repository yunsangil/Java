package hm181107;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) {
		
		String fileName="myfile/test2.txt";
		String dic = "../";
		File f = new File(fileName);
//		
//		System.out.println(f.exists()); //���� ���θ� true,false�� ��ȯ
//		System.out.println(f.getPath()); //������ ��� ��ȯ
//		System.out.println(f.getName()); //������ �̸���ȯ
		System.out.println(f.length());
		
//		System.out.println(f.canRead());
//		System.out.println(f.canWrite());
//		System.out.println(f.isFile());
//		System.out.println(f.isDirectory());
		
		File d = new File(fileName);
//		System.out.println(d.isDirectory());
		
//		File[] dList = d.listFiles();
		String[] dList = d.list();
		for(int i=0;i<dList.length; i++) {
			System.out.println(dList[i]);
		}
//		String saveFile = "new.txt";
//		File sf = new File(saveFile);
//		if(!sf.exists()) {
//			System.out.println("������ �����մϴ�.");
//			try {
//				sf.createNewFile();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
