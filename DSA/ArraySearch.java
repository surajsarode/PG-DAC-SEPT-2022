class ArraySearch
{
	public static void main(String args[])
	{
		int arr1[] = new int [50];
		int n = 30;
		arr1[0] = 20;
		arr1[1] = 35;
		arr1[2] = 37;
		arr1[3] = 40;
		arr1[4] = 45;
		arr1[5] = 50;
		arr1[6] = 51;
		arr1[7] = 55;
		arr1[8] = 67;
		arr1[9] = 61;
		arr1[10] = 62;
		arr1[11] = 63;
		arr1[12] = 87;
		arr1[13] = 97;
		arr1[14] = 77;
		arr1[15] = 57;
		arr1[16] = 47;
		arr1[17] = 27;
		arr1[18] = 54;
		arr1[19] = 55;
		arr1[20] = 56;
		arr1[21] = 58;
		arr1[22] = 59;
		arr1[23] = 60;
		arr1[24] = 61;
		arr1[25] = 62;
		arr1[26] = 63;
		arr1[27] = 64;
		arr1[28] = 65;
		arr1[29] = 66;
		
		int i;
		
		int key = 65;
		for(i=0;i<n;i++)
		{
			System.out.println("Array Element are : "+arr1[i]);
		}
		for(i=0;i<n;i++)
		{
			if(arr1[i] == key)
				break;
			
		}
		
		if(i==n)
			System.out.println("Not found at index :" +i);
		else
			System.out.println("Found at index no. : "+i);
	}
}