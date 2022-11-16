import java.util.*;
class PalindromeDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		int n = sc.nextInt();
		int t = n;
		int rev = 0;
		while(n != 0)
		
		{
			rev = rev*10+(n%10);
			n = n/10;
		}
		
		if(rev == t)
			System.out.print(t+" is Palindrom Number :");
		else
			System.out.print(t+" is Not Palindrom Number :");
		
		
	}
}