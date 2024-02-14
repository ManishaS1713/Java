package JavaEclipseCode;
//Q.57 find the maximum and minimum element in the array WITHOUT BUBBLE SORT
class  ArrayMiniAndMax
{
	public static void main(String[] args) 
	{
		int []ar={1,2,5,20,0,1};
		int max=ar[0];
		int min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("Minimum number is: "+min);
		System.out.println("Maximum number is: "+max);

	}
}
