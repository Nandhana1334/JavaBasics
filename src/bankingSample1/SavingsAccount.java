package bankingSample1;

		public class SavingsAccount implements Account {
		    private double initialDeposit;
		    private double interestRate;
		    private double balance;
		    private int accountNo;
		    private double total;

		    public SavingsAccount(double initialDeposit, int accountNo) {
		        this.initialDeposit = initialDeposit;
		        this.accountNo = accountNo;
		    }

		    @Override
		    public void deposit(double amount) {
		        balance=initialDeposit +amount;
		        System.out.println("The balance after deposited  Rp."+amount + "is " +balance);
		    }

		    @Override
		    public void withdraw(double amount) {
		        if (balance >= amount) {
		            balance -= amount;
		            System.out.println("The balance after withdrawing " +amount+ "is " +balance);
		        } 
		        else {
		            System.out.println("Insufficient balance");
		        }
		    }

		    @Override
		    public double calculateInterest(double rate) {
		        total =balance * rate/100;
		    	return total;
		    }

		    @Override
		    public double viewBalance(double total) {
		        //System.out.println("The balance is :");
		    	double p = total+balance;
		    	return p;
		    }

		    // Additional method for SavingsAccount
//		    public void applyInterest() {
//		        double interest = calculateInterest(interestRate);
//		        deposit(interest);
//		    }
		}


