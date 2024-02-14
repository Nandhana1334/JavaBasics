package homeworkSamples2;
import java.util.Scanner;
import java.util.HashSet;

public class SetComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1 = new HashSet<>();
		System.out.println("Enter the total number of elements you want in the set 1: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			set1.add(arr[i]);
			
		}
		System.out.println("First Set: " +set1);
		HashSet<Integer> set2 = new HashSet<>();
		System.out.println("Enter the total number of elements you want in the set 2: ");
		
		int n1 = sc.nextInt();
		System.out.println("Enter the elements: ");
		int arr1[] = new int[n1];
		for(int i =0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
			set2.add(arr1[i]);
			
		}
		System.out.println("Second Set: " +set2);
		set1.retainAll(set2);
		System.out.println("The same elements in both the sets :"+set1);
		
		

	}

}
