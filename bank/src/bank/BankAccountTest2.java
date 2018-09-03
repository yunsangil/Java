package bank;

import java.util.Scanner;

public class BankAccountTest2 {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		BankAccount ysi = new BankAccount();
		BankAccount ysi2 = new BankAccount("¿±ªÛ¿œ");
		BankAccount ysi3 = new BankAccount("¿±ªÛ¿œ",201311032);
		BankAccount ysi4 = new BankAccount("¿±ªÛ¿œ",201311032,10000);
		
		System.out.println(ysi2);
		System.out.println(ysi3);
		System.out.println(ysi4);
	}

}
