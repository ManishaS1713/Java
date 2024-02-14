package JavaEclipseCode;
//Q.61 print even number from an array

class  ArrayEven
{
	public static void main(String[] args) 
	{
		int [] ar={1,2,3,4,5,6};
		System.out.println("Even numbers from array: ");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}	}
}
