package DateAndTime;
import java.util.Calendar;
public class DefaultCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println(" YEAR :  " +c.get(c.YEAR));
		System.out.println(" MONTH:  " + c.get(c.MONTH));
		System.out.println(" Day:  " + c.get(c.DATE));
		System.out.println(" Hour:  " +c.get(c.HOUR));
		System.out.println(" MINUTE: " +c.get(c.MINUTE));
		
		
	}

}
