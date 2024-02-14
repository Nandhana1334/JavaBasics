package homeworkSamples2;

import java.util.Scanner;

public class Stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		String reversedString = reverseEachWord(str);
	    System.out.println("Original String: " + str);
	    System.out.println("Reversed String: " + reversedString);
		
		
		
		

	}
	 private static String reverseEachWord(String str) {
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            
	            StringBuilder reversedWord = new StringBuilder(word);
	            reversedWord.reverse();

	            
	            result.append(reversedWord).append(" ");
	        }

	        
	        return result.toString();
	    }
	

}
