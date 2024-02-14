package bankingSample;

public class Current implements Account {
	private double balance;
	private int rate;
	private double deposit;
	private double withdraw;

	public Current(double deposit,double rateofinterest,double balance,double withdraw)
	{
		this.deposit=deposit;
		this.rate=rate;
		this.balance=balance;
		this.withdraw=withdraw;
	
		
	}
//	public Current() {
//        this.balance = deposit;
//        
//    }
	public void depositAmount() {
		balance+=this.deposit;
		System.out.println("The balance in current account: " +balance);
		System.out.println("The deposited amount in Current account: " +this.deposit);
        System.out.println("The balance after amount deposited in current account: "+(this.balance+this.deposit));
		
	}

	@Override
	public void withdrawAmount() {
		// TODO Auto-generated method stub
		balance-=this.withdraw;
		System.out.println("The amount withdrawed from current account: " +this.withdraw);
		
	}

	@Override
	public double viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("The balance in current account is: "+(this.balance+this.deposit));
		return balance;
	}

	@Override
	public double interest() {
		// TODO Auto-generated method stub
		balance+=balance*rate/100;
		System.out.println("The interest  for current account is: "+balance);
		return Math.abs(balance);
	}

}
