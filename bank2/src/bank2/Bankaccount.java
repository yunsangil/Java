package bank2;

public class Bankaccount {
	
	int balance;
	void deposit(int amount) //저금
	{
		balance+=amount;
	}
	
	public void withdraw(int amount)
	{
		balance -= amount;
		
		if(balance<0)
		{
			System.out.println("출금이 불가합니다.");
			balance += amount;
		}
	}
	
	public int getBalance(){
		
		return this.balance;
	}
	
	public void addInterest()
	{
		balance=(int) (balance*0.075 + balance);
	}

}
