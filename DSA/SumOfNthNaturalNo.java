class SumOfNthNaturalNo
{
	public static void main(String args[])
	{
		SumOfNthNaturalNo s1 = new SumOfNthNaturalNo();
		int a = s1.sum(50);
		System.out.println("Sum of nth Natural number :"+ a);
	}
	
	int sum(int b)
	{
		if(b>0)
		{
			return b+sum(b-1);
		}
		else
		{
			return 0;
		}
	}
}