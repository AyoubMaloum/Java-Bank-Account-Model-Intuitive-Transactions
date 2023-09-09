package Bank;

public class Account {
	
	float balance;
	String holder;
	
	Account(){
		balance = 0;
		holder = "";
	}
	
	Account(String hold, int bal){
		holder = hold;
		balance = bal;
	}
	
	public void show_balance()
	{
		System.out.println("The balance of "+ this.holder +" is : "+ this.balance + "$");
	
	}
	
	public float deposit(float depot)
	{
		balance += depot;
		return balance;
	
	}
	
	public float draw(float dr)
	{
		balance -= dr;
		return balance;
	
	}
	
	public void send_to(Account recipient, float amount)
	{
		this.draw(amount);
		recipient.deposit(amount);
		
	}

}
