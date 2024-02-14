package basicSamples;

import java.util.Scanner;

public class IfSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str ="Java";
		if(str == "Java")
		{
			System.out.println("Programming Language");
		}
		else
		{
			System.out.println("Not Java");
		}
		int i=10;
		System.out.println("Enter the number:");
		while(i>0)
		{
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println("Positive num");
		}
		
		else if(num == 0)
		{
			System.out.println("zero");
			}
		
		else
		{
			System.out.println("Negative num");
		}
		i--;
		}
	}

}
