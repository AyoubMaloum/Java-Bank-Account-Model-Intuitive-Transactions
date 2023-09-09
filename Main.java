package Bank;

public class Main {
	
	public static void main(String[] args) {
		Account account1 = new Account("Ayoub",5500);
		Account account2 = new Account("Emma", 3000);
		
		account1.show_balance();
		account1.deposit(20);
		account1.show_balance();
		account1.draw(293);
		
		account1.show_balance();
		account2.show_balance();
		
		account1.send_to(account2, 100);
		account1.show_balance();
		account2.show_balance();
	}

}
