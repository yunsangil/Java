package bank2;

public class Bankaccount {
	
	int balance;
	void deposit(int amount) //����
	{
		balance+=amount;
	}
	
	public void withdraw(int amount)
	{
		balance -= amount;
		
		if(balance<0)
		{
			System.out.println("����� �Ұ��մϴ�.");
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
