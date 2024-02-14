package basicSamples;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type = "Java Programming";
		String first ="Java is a object oriented Programming ";
		String second = "Python";
		String third = "Language";
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println("Length of string .." +first.length());
		String substr = first.substring(10,16);
		System.out.println(substr);
		String joinedString = first.concat(third);
		System.out.println("Joined String is .." +joinedString);
		String str1 = new String(second);
		String str2 = new String(second);
		if(str1 == str2)
		{
			System.out.println("Comparing the object");
		}
		if(str1.equals(str2))
				{
					System.out.println("Both are equal");
				}
		String words[]=first.split(" ");
		for(int i=0;i<words.length;i++)
			{
				System.out.println(words[i]);
			}
		char c;
		c=first.charAt(3);
		System.out.println(c);
		boolean result = first.equalsIgnoreCase(second);
		System.out.println("Strings first and second are equal :" +result);
		System.out.println(first.trim());
		System.out.println("Comparing two strings:" +str1.equals(str2));
		System.out.println("Value of newstring :" +first.toUpperCase());

}
}
