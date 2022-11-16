class First
{
	void myFun(int x, int y)      //overloading method
	{
		System.out.println("MyFun of First");
	}
	void anotherFun(int x)
	{
		System.out.println("anotherFun of First");
		
	}
}


class Second extends First
{
	void myFun(int x, int y)       //Overloading method
	{
		System.out.println("myFun of Second");
	}
}


public class MethodOverloadingDemo1
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.myFun(2,5);
		
	}
}