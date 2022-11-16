import java.util.*;
class Student
{
	int rollno;
	double marks;
	
	Student()
	{
		rollno = 0;
		marks = 0.0;
	}
	
	Student(int rollno, double marks)
	{
		this.rollno = rollno;
		this.marks = marks;
	}
	
	void printDetails()
	{
		System.out.println("Roll No. :"+rollno+", "+"marks :"+marks);
		
	}
}

class ArrayDemo1
{
	public static void main(String args[])
	{
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no. of student");
		size = sc.nextInt();
	
		Student stud[] = new Student[size];
	
		System.out.println("Please enter details of students");
	
		for(int i = 0; i < size; i++)
		{
			System.out.println("Enter rollNo. and Marks ");
			int r = sc.nextInt();
			double m = sc.nextDouble();
			stud[i] = new Student(r , m);
			stud[i].printDetails();
		}
		/*System.out.println("student details are");
	
		for(int i = 0; i < size; i++)
		{
			stud[i].printDetails();
		}
		*/
	}
}