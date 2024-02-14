package oopSamples;

public class AuditStudent extends Student {
    public AuditStudent(String str)
    {
    	name = str;
    }
//    public AuditStudent()
//    {
//    	super();
//    }
	
	public void goToClass()
	{
		
		System.out.println(" Go to the room 8");
	}
	public void goToClass(String direction)
	{
		System.out.println("Go to the Second Block");
		System.out.println("Go to the classroom 17");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
