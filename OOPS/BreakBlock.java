class BreakBlock{
	public static void main(String args[]){
		
		int a = 5;
		
		block1: {
			System.out.println("Hello");
			
			block2: {
				System.out.println("Hii");
				if(a==5)
				{
					break block1;
					
				}
				System.out.println("I am here  " );
			}
			System.out.println("Out of block2");
		}
		System.out.println("Out of block1");
		System.out.println("Byee");
		
	}
}