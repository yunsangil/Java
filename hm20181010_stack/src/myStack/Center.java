package myStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Center {
	
	private Scanner in = new Scanner(System.in);
	private String infix=null;
	private String postFix=null;
	Center(){
		init();
		toPostFix();
	}
	
	public void init() {
		System.out.println("수식 입력");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			this.infix = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
	private void toPostFix()
	{
		InToPost inpost = new InToPost(infix);
		postFix=inpost.getPost();
		System.out.println(postFix);
	}
}
