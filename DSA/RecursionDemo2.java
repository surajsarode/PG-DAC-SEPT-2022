import java.util.*;
class RecursionDemo2
{
	//static int i = 0;
	
	static int show(int n)
	{
		if(n==5)  //base  condition
			return n;
		else
			return 2 * show(n+1);
		
	}
	
	public static void main(String args[])
	{
		System.out.println(show(3));
	}
}
