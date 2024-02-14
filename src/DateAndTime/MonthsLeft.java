package DateAndTime;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class MonthsLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate l = LocalDate.now();
		LocalDate lastDay = l.with(TemporalAdjusters.lastDayOfYear());
		Period p = l.until(lastDay);
		System.out.println("*****");
		System.out.println("Months Left :" +p.getMonths());
	}

}
