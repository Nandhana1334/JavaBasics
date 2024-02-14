package Array;

public class HelloWorld {
	int i,j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Welcome");
		HelloWorld obj = new HelloWorld();
		System.out.println("value of i " +obj.i);
		//System.out.println(obj.addition(34,, 10));
		System.out.println(HelloWorld.addition(23, 10));
	}
	public static int addition(int num1,int num2)
	{
		int sum = num1+num2;
		return sum;
	}

}
