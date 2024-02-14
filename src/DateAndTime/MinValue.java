package DateAndTime;

import java.util.Calendar;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println("*****");
		System.out.println("Minimum value of the year:"+c.getActualMinimum(c.YEAR));
		System.out.println("Minimum value of the month:"+c.getActualMinimum(c.MONTH));
		System.out.println("Minimum value of the week :"+c.getActualMinimum(c.WEEK_OF_YEAR));
		System.out.println("Minimum value of the Date:"+c.getActualMinimum(c.DATE));
	}

}
