package homeworkSamples;
import java.util.Scanner;
public class InchesToMeters {
	public static void main(String[] args) {
		double i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measurement  in inches:");
		
		i=sc.nextInt();
		double c =i * 0.0254;
		System.out.println("Conversion of Inches to Meters:  " +c);
	}
}
