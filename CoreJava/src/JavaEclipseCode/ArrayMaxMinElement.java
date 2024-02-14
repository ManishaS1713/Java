package JavaEclipseCode;
class  ArrayMaxMinElement
{
	public static void main(String[] args) 
	{
		int [] a={5,3,2,1,5};
		int max=0, min=0, sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]>a[0])
			{
				max=a[i];
			}
			if (a[i]<a[0])
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		sum=max-min;
		System.out.println("Difference between minimum and maximumelement is: "+sum);
	}
}
