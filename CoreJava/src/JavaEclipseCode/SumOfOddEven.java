package JavaEclipseCode;//Q.63 sum of odd numbers and sum of even numbers from an array

class  SumOfOddEven
{
	public static void main(String[] args) 
	{
		int [] ar={1,2,3,4,5,6};
		int sumOdd=0, sumEven=0;
		for (int i=0; i<ar.length; i++)
		{
			if(ar[i]%2==0)
			{
				sumEven+=ar[i];
			}
			else
			{
				sumOdd+=ar[i];
			}
		}
		System.out.println("sum of odd and even is: "+sumOdd+" and "+sumEven);
	}
}