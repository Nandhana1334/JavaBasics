package Array;

import java.util.HashMap;

public class MapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		System.out.println("HashMap: " +languages);
		String value = languages.get(1);
		System.out.println("Value at index 1:" +value);
		System.out.println("Keys:" +languages.keySet());
		System.out.println("values: "+languages.values());
		
		System.out.println("Key/value mappings: "+languages.entrySet());
		String valueRem = languages.remove("Two");
		System.out.println("Removed Value: " +valueRem);
		
		
		
		

	}

}
