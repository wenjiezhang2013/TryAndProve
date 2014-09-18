package serialization;

import java.io.Serializable;


public class Person implements Serializable
{
	/**
     * 
     */
    private static final long serialVersionUID = 8628960625662658980L;
	public int age;
	public String name;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}
