package BankApp;

public class AccountTest {

	public static void main(String[] args) {
		 
        Account acc = new Account("Elizabeth", 500.0);

        acc.deposit(200);
        acc.deposit(-50); 

        acc.withdraw(100);
        acc.withdraw(700); 

        
        double balance = acc.getBalance();
        System.out.println("Final Balance: " + balance);

	}

}
