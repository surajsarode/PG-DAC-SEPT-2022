import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList <String> list1 = new ArrayList<String>();
		
		list1.add("Suraj");
		list1.add("Sharad");
		list1.add("Pranav");
		list1.add("Shree");
		
		//using for-each loop
		for(String s : list1)
		{
			System.out.println(s);
		}
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("prannav");
		list2.add("amar");
		list2.add("raman");
		
		
		for(String s : list2)
		{
			System.out.println(s);
		}
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("Shyam");
		list3.add("Ram");
		list3.add("mohit");
		list3.add("piyush");
		
		//addAll() method
		list1.addAll(list2);
		System.out.println("list1 element aafter adding list2 element");
		for(String s : list1)
		{
			System.out.println(s);
			
		}
		
		//clear() method
		
		//list1.clear();
		
		System.out.println("list1 element aafter adding list2 element");
		
		for(String s : list1)
		{
			System.out.println(s);
			
		}
		
		//contains() method
		
		boolean b;
		b = list1.contains("shyam");
		
		System.out.println("list.contains(\"Shyam\") : " + b);
		
		b = list1.contains("Rajan");
		System.out.println("list.contains(\"raman\") : " + b);
		
		b = list1.containsAll(list2);       //true
		System.out.println("list.contains(\"Shyam\") : " + b);

		b = list1.containsAll(list3);
		System.out.println("list.contains(\"raman\") : " + b);
		
		//isEmpty() method
		b = list1.isEmpty();
		System.out.println("list.isEmpty() :" + b);
		
		
		//remove() method
		list1.remove("Mukesh");
		System.out.println("list1 after removing mukesh : ");
		display(list1);
		
		
		//removeAll() method
		list1.removeAll(list2);
		System.out.println("list1 element after removing all list12 :");
		display(list1);
		
		System.out.println("list12 element :");
		display(list2);
		
		
		//retainAll method
		list1.retainAll(list3);
		System.out.println("list1 element after retaining all list3 :");
		display(list1);
		
		System.out.println("list3 element : ");
		display(list3);
		
		
		//size() method 
		int r = list1.size();
		System.out.println("list1.size() :" + r);
		
		//toArray() method
		String [] arr =(String []) (list1.toArray();
		System.out.println("interating arr after list1.toArray" );
		for(Object ob : arr)
		{
			System.out.println(ob);
		}
		
	}
}