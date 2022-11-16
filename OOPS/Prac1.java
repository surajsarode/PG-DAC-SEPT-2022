class Prac1{
	
	public static void main(String args[]){
		
		int x = 3;
		int z;
		{
			int y = 10;
			x = 20;
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println(x);
	}
}
