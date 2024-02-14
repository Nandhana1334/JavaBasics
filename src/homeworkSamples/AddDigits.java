package homeworkSamples;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		if(num>0 && num<=1000)
		{
			for(sum=0; num!=0; num=num/10)  
			{  
			   
				sum = sum + num % 10;  
			}  
			
			System.out.println("Sum of digits: "+sum);  
		}
		else
		{
			System.out.println("The input is greater than 1000");
		}
		

	}

}
