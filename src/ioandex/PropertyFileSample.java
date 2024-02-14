package ioandex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties connprop = new Properties();
		connprop.setProperty("username", "nandhana");
		connprop.setProperty("password", "nand12");
		FileOutputStream propsFile = new FileOutputStream("Info.properties");
		connprop.store(propsFile, "Properties File");
		propsFile.close();
		String uname = null;
		String password = null;
		Properties tempProp = new Properties();
		FileInputStream obtained = new FileInputStream("Info.properties");
		tempProp.load(obtained);
		propsFile.close();
		uname = tempProp.getProperty("username");
		password = tempProp.getProperty("password");
		System.out.println(uname+password);
		
		
		
		
		
	}

}
