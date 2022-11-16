class First
{
	String name;
	
	First()
	{
		
	}
	First(String name)
	{
		this.name = name;
		
	}
	public void finalize()
	{
		System.out.println("finalize called for : "+name);
	}
}

class Demo
{
	static void myFun()
	{
		First f1 = new First("first object");
		
	}
}

class GarbageCollectionDemo
{
	public static void main(String args[])
	{
		Demo.myFun();
		
		//code
	}
}