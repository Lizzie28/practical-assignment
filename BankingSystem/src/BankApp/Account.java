package BankApp;


	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;

	public class Account extends Bank {

	    
	    public Account(String accountName, double balance) {
	        super(accountName, balance);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            recordTransaction("Deposited: " + amount);
	        } else {
	            recordTransaction("Invalid deposit attempt: " + amount);
	            System.out.println("Deposit amount must be greater than 0.");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance && amount > 0) {
	            balance -= amount;
	            recordTransaction("Withdrew: " + amount);
	        } else {
	            recordTransaction("Failed withdrawal attempt: " + amount);
	            System.out.println("Withdrawal amount exceeded account balance.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        recordTransaction("Checked balance: " + balance);
	        return balance;
	    }

	    
	    private void recordTransaction(String message) {
	        try (PrintWriter writer = new PrintWriter(new FileWriter("Bank.txt", true))) {
	            writer.println(accountName + " - " + message + " | Current Balance: " + balance);
	        } catch (IOException e) {
	            System.out.println("Error writing to file.");
	        }
	    }
	}


