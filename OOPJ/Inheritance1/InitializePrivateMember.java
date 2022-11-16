class First
{
	private int a;
	
	First()
	{
		System.out.println("First zero-arg constructor called");
	}
	First(int a)
	{
		System.out.println("First's 1-arg constructor called");
		this.a = a;
	}
	void setA(int a)
	{
		this.a = a;
	}
	int getA()
	{
		return a;
	}
}

class Second extends First
{
	int b;
	Second()
	{
		System.out.println("second o-arg constructor called");
	}
	Second(int a, int b)
	{
		super(a);
		this.b = b;
		System.out.println("Second 
	}
}


class InitializePrivateMember
{
	
}