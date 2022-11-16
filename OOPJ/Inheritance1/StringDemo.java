import java.util.*;
class StringDemo
{
	public static void main(String args[])
	{
		String s1 = "Welcome ";
		String s2 = new String("Welcome");
		String s3 = "Welcome";
		String s4 = new String("Welcome");
		
		System.out.println("s1 ==  s2 return " + (s1 == s2));   //false
		System.out.println("s1 ==  s3 return " + (s1 == s3));    //true
		System.out.println("s3 ==  s4 return " + (s3 == s4));    //false
		
		
		System.out.println("s1.equal(s2) return " + (s1 == s2));    //false
		System.out.println("s1.equal(s3) return " + (s1 == s3));    //false
		System.out.println("s3.equal(s4) return " + (s3 == s4));		//false
		
		
		char ch = s1.charAt(3);
		System.out.println("s1.charAt(0) return :"+s1.charAt(0));
		
		char chr[] = new char[10];
		
		s1.getChars(2,5,chr,0);
		
		for(int i =0; i < chr.length; i++)
		{
			System.out.println(chr[i]);
			
		}
		System.out.println();
		
		byte [] b = s1.getBytes();
		
		
		
		
	}
}