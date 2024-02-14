package homeworkSamples;

import java.util.Scanner;

public class FarenheitToCelsius {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in farenhiet:");
		
		f=sc.nextInt();
		float c =(f-32)*5/9;
		System.out.println("Conversion of farenhiet to celsius:  " +c);
		

	}

}
