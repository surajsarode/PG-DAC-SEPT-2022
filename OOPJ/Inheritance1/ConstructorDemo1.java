class Student
{
	int rollno;
	int age;
	double marks;
	
	Student(int r)
	{
		System.out.println("Zero argument Constructor");
		rollno = r;
	}
	void setDetails(int r, int a, double m)
	{
		rollno = r;
		age = a;
		marks = m;
	}
	
	void printDetails()
	{
		System.out.println(rollno+" "+age+" "+marks);
		
	}
}

class ConstructorDemo1
{
	public static void main(String args[]){
		
		Student sdt1 = new Student(1);
		sdt1.printDetails();
		sdt1.setDetails(2,25,78.99);
		sdt1.printDetails();
	}
}