package HashEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMainTest {
	//List >. ArrayList<word> word string eng, kor
	//순서 있다
	// Map >> hashmap, 순서가 없다. <Key, value> //중복키 불가, 중복키 중 하나는 제거됨
	public static void main(String[] args) {
	
		HashMap<String, String> dic = new HashMap<>();
		Test a = new Test();
		HashMap<String, ArrayList<Test>> dic2 = new HashMap<>();
		ArrayList<Test> testarray = new ArrayList<>();
//		String[] a = new String[10];
//		a[0]="aaa";
//		dic2.put("aa", testarray.);
		dic.put("baby", "아기");
		dic.put("love","사랑");
		dic.put("apple","사과");
		System.out.println(dic.get("baby"));
		
		Set<String> keys = dic.keySet();
		Iterator<String> myDic = keys.iterator();
		while(myDic.hasNext()) {
			String key = myDic.next();
			String value = dic.get(key);
			System.out.println(key +"/" +value);
		}
		System.out.println("검색어 입력>>");
		Scanner in = new Scanner(System.in);
		String sWord = in.nextLine();
		myDic = keys.iterator();
		System.out.println(myDic.next());
	}
}
