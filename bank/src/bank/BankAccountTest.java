package bank;

import java.util.Scanner;

public class BankAccountTest {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		BankAccount ysi = new BankAccount();
		
		ysi.balance=50;
		System.out.println("출금하실 금액을 입력하세요.");
		ysi.withdraw(input.nextInt());
		
		System.out.println("현재 귀하의 잔액은 :"+ysi.getBalance(ysi)+"만원 입니다.");
	}

}
