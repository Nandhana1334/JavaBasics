package FileSamples;
import java.io.File;
public class FileSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\New folder");
		if(file.exists())
		{
			long size = file.length();
			System.out.println("File size in bytes is :" +size);
			System.out.println("File size in kb is :" + (size/1024));
			System.out.println("File size in mb is :" +(size/(1024*1024)));
		}
		else
		{
			System.out.println("No file found");
		}
	}

}
