class First{
	public int a;
	private int b;
	
	
	void myFun()
	{
		System.out.println(a);  //ok
		System.out.println(b);   //ok
		
	}
}


class AccessSpecifier
{
	public static void main(String args[])
	{
		First f = new First();
		System.out.println(f.a);      //ok
		//System.out.println(f.b);   //Compilation error bcoz int b private access in First
		f.display();
	}
	
}