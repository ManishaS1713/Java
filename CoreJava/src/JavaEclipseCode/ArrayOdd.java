package JavaEclipseCode;
//Q.60 print odd number from an array

class  ArrayOdd
{
	public static void main(String[] args) 
	{
		int [] ar={1,2,3,4,5,6};
		System.out.println("Odd numbers from array: ");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]);
			}
		}
	}
}
