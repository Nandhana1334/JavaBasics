package Array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class SetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> evenNumber = new HashSet<>();
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(8);
		evenNumber.add(6);
		System.out.println("HashSet: " +evenNumber);
		HashSet<Integer> numbers = new HashSet<>();
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New Hashet :" + numbers);
		Iterator<Integer> iterate = numbers.iterator();
		System.out.println("Hashet using Iterator:");
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());
			System.out.println(",");
		}
		boolean value1 = numbers.remove(5);
		System.out.println("Is 5 removed?" +value1);
		boolean value2 = numbers.removeAll(numbers);
		System.out.println("Are all elements removed?" +value2);
		
		HashSet<String> empList = new HashSet<>();
		empList.add("John");
		empList.add("Peter");
		empList.add("Andrew");
		System.out.println("List of employess..." +empList);
		empList.add("Rosy");
		System.out.println("List of employees after adding John.." +empList);
		TreeSet<String> empList1 = new TreeSet<>();
		empList1.add("John");
		empList1.add("Peter");
		empList1.add("John");
		System.out.println("List of employees..." +empList1);
		
		

	}

}
