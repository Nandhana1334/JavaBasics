package bankingSample;



public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Current c = new Current(7000,4,2000,3000);
		Savings s = new Savings(8000,8,5000,2000);
		Bank b = new Bank();
		b.addAccount(s);
		b.addAccount(c);
		s.depositAmount();
		s.withdrawAmount();
		s.viewBalance();
		s.interest();
		c.depositAmount();
		c.viewBalance();
		c.withdrawAmount();
		c.interest();
	
		
		
	}

}
