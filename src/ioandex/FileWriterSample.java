package ioandex;

import java.io.FileWriter;

public class FileWriterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = " Hello World ";
		try {
			FileWriter output = new FileWriter("output.txt",true);
			output.write(data);
			output.flush();
			output.close();
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		

	}

}
