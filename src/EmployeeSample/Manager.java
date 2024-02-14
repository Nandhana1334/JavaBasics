package EmployeeSample;

public class Manager extends Emp {

	public Manager() {
		
	}
	public Manager(String name,String address,int salary,String jobtitle)
	{
		super(name,address,salary,jobtitle);
	}
	
	public double calculateBonus(int salary)
	{
		int c =salary*3/100;
		System.out.println("The bonus is :"+c);
		return c;
	}
	public void performanceReport()
	{
		System.out.println("Satisfactory");
	}
	
	public void managingProject()
	{
		System.out.println("Assigned Project-2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
