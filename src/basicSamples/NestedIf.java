package basicSamples;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n1=10,n2 =3,n3=9;
		System.out.println("Enter the numbers:");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int large=0;
		System.out.println("The numbers are:" +n1+"," +n2+"," +n3);
		if(n1>=n2)
		{
			if(n1>=n3)
			{
				large = n1;
			}
			else
			{
				large =n3;
			}
		}
		else
			
		{
			if(n2>=n1)
			{
				if(n2>=n3)
				{
					large = n2;
				}
			}
		}
		System.out.println("The Largest number is :" +large);		

	}

}
