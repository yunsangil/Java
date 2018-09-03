package bank;

public class BankAccount {
	int balance;
	String owner;
	int accountNumber;
	
	public BankAccount(){
		
		int balance;
		String owner;
		int accountNumber;
	}
	public BankAccount(String o){
		
		owner = o;
	}
	public BankAccount(String o,int an)
	{
		owner = o;
		accountNumber = an;
	}
	public BankAccount(String o,int an,int b)
	{
		balance = b;
		owner = o;
		accountNumber = an;
	}
	
	public int getBalance(BankAccount bankaccount){
		
		return bankaccount.balance;
	}
	public int getbalance(){
		
		return this.balance;
	}
	public String getowner(){
		return this.owner;
	}
	public int getaccountNumber(){
		
		return this.accountNumber;
	}
	public void setBalance(int balance){
		
		this.balance=balance;
	}
	public void setowner(String owner){
		
		this.owner=owner;
	}
	public void setaccountNumber(int accountNumber){
		
		this.accountNumber=accountNumber;
	}
	public String toString()
	{
		return "계좌 주 :" +owner+"계좌 번호 :" +accountNumber+ "잔액" +balance;
	}
	
	
	public void deposit(int amount)
	{
		balance += amount;
	}
	public void withdraw(int amount)
	{
		if(balance<0)
		{
			System.out.println("출금이 불가능합니다.");
		}
		
		else
		{
		balance -= amount;
		}
	}
}
