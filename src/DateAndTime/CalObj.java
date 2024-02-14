package DateAndTime;
import java.util.Calendar;
public class CalObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.set(c.YEAR, 2024);
		c.set(c.MONTH, 1);
		c.set(c.DATE,27);
		java.util.Date d = c.getTime();
		System.out.println("Date :" +d);
	}

}
