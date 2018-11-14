package StringTokenizerEx1;

import java.util.StringTokenizer;

public class EX1 {
	
	public static void main (String[] args) {
		
		String text="java/jsp^DB";
		String[] s = text.split("/");
		System.out.println(s.length);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		StringTokenizer st = new StringTokenizer("/^",text,true);
		System.out.println("Token °¹¼ö : "+st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
