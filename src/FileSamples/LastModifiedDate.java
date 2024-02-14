package FileSamples;
import java.time.*;
import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class LastModifiedDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		File file = new File("C:\\New folder");
		if(file.exists())
		{
			long modified = file.lastModified();
			SimpleDateFormat  format = new SimpleDateFormat("yyyyMMDD");
			String m = Long.toString(modified);
			Date date = format.parse(m);
			System.out.println("Last Modified date :" +date);
			
			
			
		}
		else
		{
			System.out.println("File not found");
		}
		
	}

}
