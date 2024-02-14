package homeworkSamples2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class RevArrayList {

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
		System.out.println("Before Reversing: " +Fruits);
		Collections.reverse(Fruits);
		System.out.println("After Reversing :" +Fruits);
		
		

	}

}
