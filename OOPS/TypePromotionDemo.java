class TypePromotionDemo{
	
	public static void main (String args[]){
		int a = 5;
		double d = 6.5;
		
		//double res = a * d ;    // no data loss, no typecasting needed
		
		//int reslt = a * d ;
		//int reslt = (int)a * d;  //data loss, int * double = double * double = double
		
		int reslt = (int)(a * d);   //get result
		
		int res = a * (int)d;     // get result
		
		System.out.println(res);
		System.out.println(reslt);
		
		byte  q = 15;
		byte  p = 5;
		//byte res1 = q * P;  // error of lossy conversion
		
		int res1 = q * p;
		
		System.out.println(res1);
		
		
	}
}