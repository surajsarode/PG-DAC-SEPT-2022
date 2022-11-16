class First{
	int a;
	First()
	{
		System.out.println("Zero-arg const of First");
		a = 1;
	}
}
class Second
{
	int b;
	Second()
	{
		System.out.println("Zero-arg const Second");
		b = 2;
		
	}
}


class ConstructorCalling
{
	public static void main(String args[])
	{
		new Second();
	}
}