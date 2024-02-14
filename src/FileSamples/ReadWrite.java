package FileSamples;

import java.io.File;

public class ReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("C:\\New folder");
		File files[] = dir.listFiles();
		for(int i=0;i<files.length;i++)
		{
			//System.out.println(files[i].getName());
			if(files[i].canRead())
			{
				System.out.println(files[i].getName() +" can read ");
			}
			else 
			{
				System.out.println(files[i].getName() + " cannot read");
			}
			
			
		}
		for(int i=0;i<files.length;i++)
		{
			//System.out.println(files[i].getName());
			if(files[i].canWrite())
			{
				System.out.println(files[i].getName() +" can write ");
			}
			else if(!(files[i].canWrite()))
			{
				System.out.println(files[i].getName() + " cannot write");
			}
			
			
		}
		
		

	}

}
