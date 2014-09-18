package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * This is a prove of concept to try that Java serialization/deserialization can work across different version of JVM
 * 
 * I have tried to prove this by using Oracle JVM 1.6, 1.7 and 1.8
 * 
 * Ran this class to write object to the file in JVM 1.7 and read the object from Jvm 1.6 and 1.8, both of them work fine
 * 
 * 
 * @author wenjiezhang
 *
 */
public class Test
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream out = new FileOutputStream(new File("./data/data.obj"));
		
		ObjectOutputStream objectOut = new ObjectOutputStream(out);
		
		objectOut.writeObject(new Person("Jack", 30));
		
		objectOut.close();
		out.close();

	}

}
