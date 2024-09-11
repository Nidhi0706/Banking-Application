import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
        BankAccount obj = new BankAccount("XYZ", "B00012");
		obj.showMenu();

	}

}

class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid){
		customerName = cname;
		customerId = cid;
		
	}
	
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		else {
			System.out.println("No Transactin Ocurred");
		}
		
		
	}
	void showMenu() {
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Welcome " + customerName);
		System.out.println("your ID is: " + customerId);
		System.out.println("\n");
		System.out.println("A. Bank balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("Enter an option: ");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A':
				System.out.println("Balance = " + balance);
				System.out.println("\n");
				
				break;
				
			case 'B':
				System.out.println("Enter an amount to deposit");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println("\n");

				break;
				
			case 'C':
				System.out.println("Enter an amount to Withdraw: ");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");

				break;
			
			case 'D':
				getPreviousTransaction();
				System.out.println("\n");

				break;
				
			case 'E':
				break;
				
			default:
				System.out.println("Invalid option please enter correct option ");
				break;
				
			}
			
			
		}
		while(option != 'E'); 
		System.out.println("Thanks for using our services");
			
			
		}

		
	}
