package homeworkSamples2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CopyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Fruits = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String str;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the fruit you want to add: ");
			str = sc.nextLine();
			Fruits.add(str);
			
			
		}
		System.out.println("The List1: " +Fruits);
		ArrayList<String> veggies = new ArrayList<String>();
		
		String str1;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the fruit you want to add: ");
			str1 = sc.nextLine();
			veggies.add(str1);
			
			
		}
		System.out.println("The List 2: " +veggies);
		Collections.copy(veggies, Fruits);
		System.out.println("The copied list");
		System.out.println(veggies);
	}

}
