package homeworkSamples2;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> vehicles = new HashMap<>();
		vehicles.put(1, "Bike");
		vehicles.put(2, "Car");
		vehicles.put(3, "Jeep");
		System.out.println("HashMap: " +vehicles);
		System.out.println("Enter the key you want to get the value :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(vehicles.containsKey(num))
		{
			System.out.println("The value for the specified key is: "+vehicles.get(num));
		}
		else
		{
			System.out.println("The key does not exist");
		}
	}

}
