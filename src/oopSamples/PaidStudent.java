package oopSamples;

public class PaidStudent extends Student  implements ScoreInterface{

	public PaidStudent(String str)
	{
		name = str;
	}
	public void goToClass()
	{
		System.out.println("Go to class after payment");
	}
	
	public double calculateScore()
	{
		System.out.println("76");
		return 45;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
