package practice2;

import java.util.Scanner;

public class practice2 {
	
	public static void main(String[] args){
		

	Scanner in = new Scanner(System.in);
	System.out.println("가위 바위 보 게임입니다. 가위,바위,보 중에서 입력하세요");
	System.out.println("순서대로 철수,영희 입니다.");
	while (in.hasNext()){
	String var=in.next();
	String var2=in.next();

	System.out.println("철수 >>"+var+"");
	System.out.println("영희>>"+var2+"");
	
	if(var.equals("가위")){
		if(var2.equals("가위")){
			System.out.println("비겼습니다.");
		}
			else if(var2.equals("바위"))
			{
				System.out.println("영희가 이겼습니다.");
			}
			else if(var2.equals("보"))
			{
				System.out.println("철수가 이겼습니다.");
			}
		}
		else if(var.equals("바위")){
			if(var2.equals("가위"))
			{
				System.out.println("철수가 이겼습니다.");
			}
			else if(var2.equals("바위"))
			{
				System.out.println("비겼습니다.");
			}
			else if(var2.equals("보"))
			{
				System.out.println("영희가 이겼습니다.");
			}
		}
		else if(var.equals("보")){
			if(var2.equals("가위"))
			{
				System.out.println("영희가 이겼습니다.");
			}
			else if(var2.equals("바위"))
			{
				System.out.println("철수가 이겼습니다.");
			}
			else if(var2.equals("보"))
			{
				System.out.println("비겼습니다.");
			}
		}
	}
}
}
