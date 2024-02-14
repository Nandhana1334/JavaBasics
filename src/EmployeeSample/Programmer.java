package EmployeeSample;

public class Programmer extends Emp {
	public Programmer() {
		
	}
	public Programmer(String name,String address,int salary,String jobtitle)
	{
		super(name,address,salary,jobtitle);
	}
	
	public double calculateBonus(int salary)
	{
		int c =salary*9/100;
		System.out.println("The bonus is :"+c);
		return c;
	}
	public void performanceReport()
	{
		System.out.println("Average");
	}
	
	public void managingProject()
	{
		System.out.println("Assigned Project-4");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
