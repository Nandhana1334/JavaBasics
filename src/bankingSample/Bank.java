package bankingSample;
import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List accounts;
	public Bank()
	{
		accounts = new ArrayList<>();
	}
	public void addAccount(Account a)
	{
		accounts.add(a);
	}
	

}
