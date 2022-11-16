class ExceptionDemo1
{
	public static void main(String args[])
	{
		System.out.println("Program start execution");
		int a = 10;
		int b = 2;
		int res = 0;
		
		int arr[] = {5,10,15,20,25};
		try
		{
			res = a/b;     // It may cause ArithmeticException
			System.out.println(arr[4]);   //It may cause ArrayIndexOutOfBoundsException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception caugth here :");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException ");
		}
		
		finally
		{
			System.out.println("finally block");
		}
		
		
		
		System.out.println("Result = :" + res);
		System.out.println("Program executed successfully");
	}
	
}