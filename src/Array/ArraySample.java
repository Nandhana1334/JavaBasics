package Array;

public class ArraySample {

	public static void main(String[] args)
	{
		String strNames[] = {"nancy","steve", "dustin"};
		int[] age = {1,34,21,4,9};
		System.out.println("Accessing elements of array: ");
		System.out.println("First element :" +age[0]);
		System.out.println("Second element :" +age[1]);
		System.out.println("Third element :" +age[2]);
		System.out.println("Fourth element :" +age[3]);
		System.out.println("Fifth element :" +age[4]);
		
		System.out.println("Uisng for loop");
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		//using for each loop
		System.out.println("Using for-each loop");
		for(int a:age)
		{
			System.out.println(a);
		}
		
		int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
		int sum =0;
		Double average;
		for(int number:numbers)
		{
			sum+=number;
		}
		int arrayLength = numbers.length;
		average =((double)sum /(double)arrayLength);
		System.out.println("sum =" +sum);
		System.out.println("Average =" +average);
		
		int[][] a = {
				{1,2,3},{4,5,6,7},{3,2,1}};
		
		System.out.println("Length of row 1:" +a[0].length);
		System.out.println("Length of row 2:" +a[1].length);
		System.out.println("Length of row 3:" +a[2].length);
		
		}
	
	}


