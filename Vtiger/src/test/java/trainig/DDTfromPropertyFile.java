package trainig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DDTfromPropertyFile {

	public static void main(String[] args) throws Throwable {
		
FileInputStream fis= new FileInputStream("./src/test/resources/VtigerCommonData.properties");
	Properties pobj= new Properties();
	pobj.load(fis);
	String un = pobj.getProperty("UserName");
	
	
	}

}
