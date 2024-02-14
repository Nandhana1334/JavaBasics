package bankingSample1;



	public class CurrentAccount implements Account {
	    private double balance;
	    private double deposit;
	    private double rate;
	    private int accountNo;
	    

	    public CurrentAccount(double balance,int accountNo) {
	        this.balance = balance;
	        this.accountNo=accountNo;
	       
	    }

	    @Override
	    public void deposit(double amount) {
	        balance= balance+amount;
	        System.out.println("The balance after deposited "+amount + "is " +balance);


	        
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
	        double u = balance * rate/100;
	        return u;
	    }

	    @Override
	    public double viewBalance(double u) {
	        //System.out.println("The balance amount is: " +balance);
	    	double t = balance+u;
	        return t;
	    }

	    
	   
	}


