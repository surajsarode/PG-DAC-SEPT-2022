class RecursionDemo1
{
	
	static int i = 0;
	static void show()
	{
		
		++i;
		if(i<=5)  //terminate condition or base condition
		{
		
			System.out.println("Happy Diwali");
			show(); //Recursion call
		}
	}
	
	public static void main(String args[])
	{
		show();
	}
}