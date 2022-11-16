import java.util.*;
class Student {
	int a;
	double d;
	
	
	Student()
	{
		//a = 1;
		//d = 0;
		
	}
	
	Student(int a, double d)
	{
		this.a = a;
		this.d = d;
		
	}
	
	void printDetail()
	{
		System.out.println(a + " " + d);
		
	}
	
}
class Practice1{
	public static void main(String args[])
	{
		Student std = new Student();
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.nextDouble();
		std.printDetail();
	}
}