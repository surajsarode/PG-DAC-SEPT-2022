class ForEachDemo
{
	public static void main(String args[]){
		int arr[] = {5,10,15,20,25};
	
		System.out.println("Print array using normal for loop");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
	
		System.out.println("print array using for-each loop");
		
		for(int x : arr)
		{
			System.out.println(x);
		}
	}
}