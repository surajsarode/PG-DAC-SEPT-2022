class First
{
	int num = 5;
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
		super.myFun(x ,y);
		System.out.println("myFun of Second");
		System.out.println(super.num);  //System.out.println(num);

		
	}
}


public class MethodOverloadingDemo2
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.myFun(2,5);      //myFun of Second
		s.anotherFun(5);    // anotherFun of First
	}
}