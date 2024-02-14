package DateAndTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
public class DateDiff {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		LocalDate t = LocalDate.of(2024,01,01);
		LocalDate l = LocalDate.now();
		Period diff = Period.between(t,l);
		System.out.println(" Year Difference is : "+diff.getYears());
		System.out.println(" Months Difference is : "+diff.getMonths());
		System.out.println(" Days Difference is : "+diff.getDays());
		
	}

}
