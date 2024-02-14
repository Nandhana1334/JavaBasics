package FileSamples;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
public class SpecificFiles {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stubSystem.out.println("Enter the directory path");
		System.out.println("Enter the directory path");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// TODO Auto-generated method stub
		File file = new File(s);
		
		String[] list = file.list(new FilenameFilter()
				{
					@Override
					public boolean accept(File dir,String name)
					{
						if(name.toLowerCase().endsWith(".txt"))
						{
							return true;
						}
						else
						{
							return false;
						}
					}
				});
		for(String f:list)
		{
			System.out.println(f);
		}

	}

}
