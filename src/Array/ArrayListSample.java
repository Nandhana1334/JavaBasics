package Array;
import java.util.ArrayList;
public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<>();
		System.out.println("Size:.."  +languages.size());
		languages.add("Java");
		languages.add("python");
		languages.add("swift");
		languages.add("TypeScript");
		System.out.println("ArrayList: " + languages);
		System.out.println("Size: " +languages.size());
		System.out.println("Get Element .." +languages.get(1));
		languages.set(2, "Javascript");
		languages.remove(3);
		System.out.println("After Update ArrayList : " + languages);
		

	}

}
