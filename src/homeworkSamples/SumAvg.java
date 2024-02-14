package homeworkSamples;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,n4,n5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		n5=sc.nextInt();
		int sum = n1+n2+n3+n4+n5;
		System.out.println("The sum is: " +sum);
		int avg = sum/5;
		System.out.println("The average is :" +avg);
		

	}

}
