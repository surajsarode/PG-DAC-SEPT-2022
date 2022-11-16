class Student
{
	

	int roll_no;
	int age;
	double marks;
	void setDetails(int r, int a, double m)
	{
		roll_no = r;
		age = a;
		marks = m;
	}
	
	void printDetails()
	{
		System.out.println(roll_no+" "+age+" "+marks);
			
		
	}
		
	
}
class CreateObject1
{
	public static void main(String args[])
	{
		Student std1 = new Student();
		std1.setDetails(1,122,96.36);
		
		Student srj1 = new Student();
		srj1.setDetails(2,123,75.33);
		
		std1.printDetails();
		srj1.printDetails();
	}
}

