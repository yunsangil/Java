package bank;

import java.util.Scanner;

public class BankAccountTest {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		BankAccount ysi = new BankAccount();
		
		ysi.balance=50;
		System.out.println("����Ͻ� �ݾ��� �Է��ϼ���.");
		ysi.withdraw(input.nextInt());
		
		System.out.println("���� ������ �ܾ��� :"+ysi.getBalance(ysi)+"���� �Դϴ�.");
	}

}
