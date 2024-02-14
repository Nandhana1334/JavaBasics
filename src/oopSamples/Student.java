package oopSamples;

public abstract class Student{

	String name;
	String address;
	float gpa;
	
	//static ex
	//static string clg = "ANNA UNI";
	final String college = "IITM";
	private double average ;
	public double getAvg()
	{
		return average;
	}
	public double setAvg(double m1,double m2,double m3)
	{
		return m1+m2+m3/3;
	}
	
	public Student(){
		
	}
	public Student(String strname)
	{
		name = strname;
	}
//	public void goToClass() {
//		System.out.println("Go to next class");
//	}
	public abstract void goToClass();
	public final double calculateGPA()
	{
		
		System.out.println("Fianl method");
		return 10.5;
	}
	public void goToClass(String direction)
	{
		
	}
	
}