package ioandex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr= new char[100];
		FileReader input = null;
		try {
			System.out.println("Current folder "+System.getProperty("user.dir"));
			input = new FileReader("input.txt");
			input.read(arr);
		}catch(FileNotFoundException exp)
		{
			exp.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				input.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Data in the file: ");
		System.out.println(arr);
		
		

	}

}
