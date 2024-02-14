package bankingSample;

public class Savings implements Account {

	private double balance;
	private double deposit;
	private double rateofinterest; 
	private double withdraw;
	public Savings()
	{
		
	}
	public Savings(double deposit,double rateofinterest,double withdraw,double balance)
	{
		this.deposit=deposit;
		this.rateofinterest=rateofinterest;
		this.balance=balance;
		this.withdraw=withdraw;
	}
	@Override
	public void depositAmount() {
		// TODO Auto-generated method stub
		balance = balance + this.deposit;
		System.out.println("The balance after deposit in savings account: " +balance);
	}

	@Override
	public void withdrawAmount() {
		// TODO Auto-generated method stub
		balance = balance-this.withdraw;
		System.out.println("The amount withdrawed is: "+ withdraw +" Balance after withdrawal in savings account: "+
		balance);
	}

	@Override
	public double viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("The balance in savings account: " +balance);
		return balance;
	}

	@Override
	public double interest() {
		// TODO Auto-generated method stub
	   balance+=balance*rateofinterest/100;
	   System.out.println("The interest for savings account is: "+ balance);
	   return Math.abs(balance);
	}

}
