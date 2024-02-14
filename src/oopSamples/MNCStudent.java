package oopSamples;

public class MNCStudent extends Student implements AttendanceInterface,ScoreInterface{
	public MNCStudent (String str)
	{
		name = str;
	}
	public void goToClass()
	{
		System.out.println("Go to class after collecting eval");
	}
	public int calculateAttendance()
	{
		System.out.println("71");
		return 71;
	}
	public double calculateScore()
	{
		System.out.println("70");
		return 90;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
