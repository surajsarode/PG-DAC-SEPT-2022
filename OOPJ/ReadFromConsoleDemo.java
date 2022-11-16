import java.util.*;
class ReadFromConsoleDemo
{
	public static void main(String args[])
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter no. : ");
		String strInput = br.readLine();
		
		int num = Integer.parseInt(strInput);
		
		System.out.println("Enter float value : ");
		strInput = br.readLine();
		
		double dval = Double.parseDouble(strInput);
		
		System.out.println("Enter name :");
		strInput = br.readLine();
		
		String name = strInput;
		
		System.out.println("Enter boolean value :");
		strInput = br.readLine();
			
		boolean bval = Boolean.parseBoolean(strInput);
		
		br.close();
		
		System.out.println("The input value are as follow :");
		System.out.println(num);
		System.out.println(dval);
		System.out.println(name);
		System.out.println(bval);
	}

		
}