package HashEx;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String t = "my name is kim name name";
		System.out.println("ã�� �ܾ �Է��ϼ���.");
		Scanner in = new Scanner(System.in);
		String w = in.nextLine();
		
		System.out.println("ġȯ �ܾ �Է��ϼ���.");
		String w1 = in.nextLine();
		int searchindex = t.indexOf(w);
		int indexlength = w.length();
		int searchnext = t.indexOf(w,searchindex+indexlength);
		int count=0;
//		if(searchindex>-1)count++;
//		if(searchnext>-1)count++;
//		if(searchindex==-1&&searchnext==-1) System.out.println("ã�� ���߽��ϴ�.");
//		else System.out.println("�� "+count+"ȸ ��ŭ �ݺ��Ǿ����ϴ�.");
		
		int wordstartindex=0;
		int wordlastindex=0;
		
		String temp_t=null;
		
		while(wordstartindex<t.length())
		{
			wordstartindex = t.indexOf(w,wordstartindex);
			if(wordstartindex != -1) {
				wordlastindex = wordstartindex+w.length();
				temp_t=t.substring(0,wordstartindex)+w1+t.substring(wordlastindex);
			}
			wordstartindex = wordlastindex;
		}
		
//		wordstartindex=t.indexOf(w);
//		wordlastindex = wordstartindex+w.length();
//		temp_t=t.substring(0,wordstartindex)+w1+t.substring(wordlastindex);
		t=temp_t;
		System.out.println(t);
		
//		int endindex = 0;
//		for(int i=0;i<t.length();)
//		{
//			i = t.indexOf(w,i);
//			if(i != -1) {
//				endindex = i+w.length();
//				System.out.println(t.substring(i,endindex));
//			}
//			i = endindex;
//		}
		String userinput = t.substring(searchindex, searchindex+indexlength);
		System.out.println(t.length());
		System.out.println("��ɷ� �ٲٽðڽ��ϱ�?");
		String input2 = in.nextLine();
		String t2 = t.replaceAll(userinput, input2);
		System.out.println(t2);
		}
}
