package HashEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMainTest {
	//List >. ArrayList<word> word string eng, kor
	//���� �ִ�
	// Map >> hashmap, ������ ����. <Key, value> //�ߺ�Ű �Ұ�, �ߺ�Ű �� �ϳ��� ���ŵ�
	public static void main(String[] args) {
	
		HashMap<String, String> dic = new HashMap<>();
		Test a = new Test();
		HashMap<String, ArrayList<Test>> dic2 = new HashMap<>();
		ArrayList<Test> testarray = new ArrayList<>();
//		String[] a = new String[10];
//		a[0]="aaa";
//		dic2.put("aa", testarray.);
		dic.put("baby", "�Ʊ�");
		dic.put("love","���");
		dic.put("apple","���");
		System.out.println(dic.get("baby"));
		
		Set<String> keys = dic.keySet();
		Iterator<String> myDic = keys.iterator();
		while(myDic.hasNext()) {
			String key = myDic.next();
			String value = dic.get(key);
			System.out.println(key +"/" +value);
		}
		System.out.println("�˻��� �Է�>>");
		Scanner in = new Scanner(System.in);
		String sWord = in.nextLine();
		myDic = keys.iterator();
		System.out.println(myDic.next());
	}
}
