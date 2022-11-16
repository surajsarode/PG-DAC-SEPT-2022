class Student
{
	

	int roll_no;
	int age;
	double marks;
	void printDetails()
	{
		System.out.println(roll_no+" "+age+" "+marks);
			
		
	}
		
	
}
class CreateObject
{
	public static void main(String args[])
	{
		Student std1 = new Student();
		std1.roll_no = 122;
		std1.age = 26;
		std1.marks = 86.88;
		
		Student srj1 = new Student();
		srj1.roll_no = 121;
		srj1.age = 25;
		srj1.marks = 80.22;
		std1.printDetails();
		srj1.printDetails();
	}
}

