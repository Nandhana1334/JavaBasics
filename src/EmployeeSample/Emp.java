package EmployeeSample;

public class Emp {

	 private String name;
	 private String address;
	 int salary;
     private String jobtitle;
	 public Emp()
	 {
	
	 }
	 public Emp(String name,String address,int salary,String jobtitle)
	 {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobtitle = jobtitle;
	 }
	 public double calculateBonus(int salary)
	 {
		int c =salary*8/100;
		System.out.println("The bonus is :"+c);
		return c;
		
	 }
	
	
	public void performanceReport()
	{
		System.out.println("Good");
	}
	public void managingProject()
	{
		System.out.println("Assigned Project-1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
