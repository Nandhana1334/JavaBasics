package basicSamples;

import java.util.Scanner;

public class WhileLoopSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		while(num>=0)
		{
			sum+=num;
			System.out.println("Enter the number:");
			num=input.nextInt();
			
		}
		System.out.println("sum = " +sum);
		input.close();

	}

}
