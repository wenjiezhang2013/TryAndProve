package deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import serialization.Person;


public class Test
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream in = new FileInputStream(new File("./data/data.obj"));
		
		ObjectInputStream objectIn = new ObjectInputStream(in);
		Object o = objectIn.readObject();
		
		if(o instanceof Person)
		{
			Person p = (Person)o;

			System.out.println("This guy's name is " + p.name);
			System.out.print(" and he is " + p.age +" years old.");
			
		}
		
		objectIn.close();
		in.close();
	}

}
