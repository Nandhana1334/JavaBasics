package DateAndTime;
import java.util.Calendar;
public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println("*****");
		System.out.println("Maximum value of the year:"+c.getActualMaximum(c.YEAR));
		System.out.println("Maximum value of the month:"+c.getActualMaximum(c.MONTH));
		System.out.println("Maximum value of the week :"+c.getActualMaximum(c.WEEK_OF_YEAR));
		System.out.println("Maximum value of the Date:"+c.getActualMaximum(c.DATE));
		
	}

}
