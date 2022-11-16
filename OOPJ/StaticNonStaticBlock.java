class Demo
{
	int a;         
	int b;
	static int c;
	
	
	//Static block
	{
		c = 5;
		System.out.println("Inside the static block");
	}
	
	
	//non static block
	{
		a = 1;
		b = 2;
		System.out.println("inside non static block");
		
		
	}
	Demo()
	{
		System.out.println("inside demo constructor");
		
	}
	static void myFun()
	{
		System.out.println("Inside static method myFun and c = "+c);
		
	}
	
	void print()
	{
		System.out.println("a = "+a+" b = "+b);
	}
}



class StaticNonStaticBlock{
	public static void main(String args[])
	{
		// Demo.myFun();    //Only static block will be executed
		Demo d1 = new Demo();    
		d1.print();
		
		Demo d2 = new Demo();
		d2.print();      //only non static block execute now as static block executed only once 
		
	
	}
	
}