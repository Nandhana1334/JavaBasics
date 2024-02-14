package basicSamples;

import java.util.Scanner;

public class SwitchSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE MONTH:");
		int month = sc.nextInt();
		System.out.println("Enter the year");
		int yr=sc.nextInt();
		switch(month)
		{
		case 1:
			int days = 31;
			System.out.println("No of days in Jan " +days);
			break;
		case 3:
			days = 31;
			System.out.println("No of days in Mar" +days);
			break;
		case 4:
			days = 30;
			System.out.println("No of days in Apr" +days);
			break;
		case 5:
			days =31;
			System.out.println("No of days in May" +days);
			break;
		case 6:
			days = 30;
			System.out.println("No of days in June" +days);
			break;
		case 7:
			days=31;
			System.out.println("No of days in July" +days);
			break;
		case 8:
			days = 31;
			System.out.println("No of days in Aug" +days);
			break;
		case 9:
			days= 30;
		    System.out.println("No of days in Sep" +days);
		    break;
		case 10:
			days = 31;
			System.out.println("No of days in Oct" +days);
			break;
		case 11:
			days =30;
			System.out.println("No of days in Nov" +days);
			break;
		case 12:
			days =31;
		    System.out.println("No of days in Dec" +days);
		    break;
		case 2:
			if((yr % 4)== 0 && !(yr%100==0)||(yr%400 == 0))
			{
				days = 29;
				System.out.println("No of days in Feb:" +days);
				
				
			}
			else
			{
				days = 28;
				System.out.println("No of days in Feb" +days);
			}
			
		    
		}
		
		
		

	}

}
