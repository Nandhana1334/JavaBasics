package DateAndTime;
import java.util.Date;
import java.util.Scanner;
import java.text.*;
public class StringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Enter the date in dd/MM/yyyy format :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Date d = new SimpleDateFormat("dd/MM/yyyy").parse(s);
		System.out.println(d);
		
	}

}
