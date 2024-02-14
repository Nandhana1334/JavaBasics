package bankingSample1;

public class BankDriver {

	public static void main(String[] args) {
		

		
		    
		        Bank bank = new Bank();
		        SavingsAccount savingsAccount = new SavingsAccount(1000,1234561234);
		        CurrentAccount currentAccount = new CurrentAccount(1000,1267893789);

		        bank.addAccount(savingsAccount);
		        bank.addAccount(currentAccount);
		        System.out.println("*********Savings Account**********");
		        savingsAccount.deposit(500);
		        savingsAccount.withdraw(100);
		        //currentAccount.withdraw(300);
		        double r=savingsAccount.calculateInterest(2.4);
		        System.out.println("Interest for Savings Account: " +r);
		        System.out.println("Savings Account Balance: " + savingsAccount.viewBalance(r));
		        
		        System.out.println("*********Current Account********");
//		        System.out.println("Current Account Balance: " + currentAccount.viewBalance());
		        
		        currentAccount.deposit(500);
		        currentAccount.withdraw(100);

		        double f = currentAccount.calculateInterest(3.4);
		        System.out.println("Interest for Current Account: " +f);
		        System.out.println("Current Account Balance: " + currentAccount.viewBalance(f));
		        
		       

		        //System.out.println("Savings Account Balance after interest: " + savingsAccount.viewBalance());
		    }
}
		

	
	


