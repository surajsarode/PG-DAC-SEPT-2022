import java.io.*;
class Demo implements Serializable
{
	int a;
	String s;
	double d;
	
	Demo()
	{
		
	}
	Demo(int a, String s, double d)
	{
		this.a = a;
		this.s = s;
		this.d = d;
		
	}
	public String toString()
	{
	return "Demo[a = " + a + ", s = " + s + ", d = " + d + "]";
	
	}
}
class SerializationDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo(5,"Hello",45.00);
		
		
		FileOutputStream fos = new FileOutputStream("myobjects.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		oos.flush();
		oos.close();
		System.out.println("Object state : " + d1);
		System.out.println("object of class demo serialized and stored in the secondary sstorage");
		
	
		
	}
}