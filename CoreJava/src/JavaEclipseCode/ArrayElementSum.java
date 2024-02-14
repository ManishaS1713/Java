package JavaEclipseCode;
//Q.53 find sum of all elements in an array


class  ArrayElementSum
{
	public static void main(String[] args) 
	{
		int [] ar={1,2,3,4,5};
		int sum=0;
		for (int i=0;i<ar.length;i++ )
		{
			sum+=ar[i];
		}
		
			System.out.println("Sum of All Array element is "+sum);
	}
}