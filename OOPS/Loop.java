class Loop{
	public static void main(String args[]){
		/*
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <=5; j++)
			{
				System.out.println(i+" "+j);
			}
			System.out.println("outer of inner for loop");
		}
		System.out.println("outer of outer for loop");
		*/
		for(int i =1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.println(i + " " + j);
				if(i ==j)
				{
					break;
				}
			}
			System.out.println("out of inner for loop");
		
		}
		System.out.println("out of outer for loop");
	
	}
}


			