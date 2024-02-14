package EmployeeSample;

public class Developer extends Emp {
	public Developer() {
		
	}
	public Developer(String name,String address,int salary,String jobtitle)
	{
		super(name,address,salary,jobtitle);
	}
	
	public double calculateBonus(int salary )
	{
		int c =salary*7/100;
		System.out.println("The bonus is :"+c);
		return c;
			}
	
	
	
	public void performanceReport()
	{
		System.out.println("Excellent");
	}
	
	public void managingProject()
	{
		System.out.println("Assigned Project-3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
