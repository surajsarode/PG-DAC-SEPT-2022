class ExceptionDemo
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 5;
		
		System.out.println("Calculation the Result");
		
		int res = a/b;
		
		System.out.println("Result = :" + res);
		
		int arr[] = {5,10,15,20,25};
		
		System.out.println(arr[6]);  //Calculation the Result = :Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:  at ExceptionDemo.main(ExceptionDemo.java:16)                                  
		
		System.out.println("Program executed successfully");
	}
	
}