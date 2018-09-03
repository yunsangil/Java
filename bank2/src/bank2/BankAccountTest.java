package bank2;

import java.util.Scanner;

public class BankAccountTest {
	
	public static void main(String[] args)
	{
		
		Bankaccount b = new Bankaccount();
		Scanner input = new Scanner(System.in);
		
		
		b.balance=100;
		
		b.withdraw(120);
		
		System.out.println(b.balance);
		b.withdraw(input.nextInt());
		
		System.out.println(b.balance);
	}

}
