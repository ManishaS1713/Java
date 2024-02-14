package JavaEclipseCode;//Q.69 compare elements in two arrays and return true if arrays are identical


class CompareTwoArrays 
{
	public static void main(String[] args) 
	{
		int []arr={1,2,3};
		int []frr={1,2,3};
		boolean flag=false;
		if(arr.length==frr.length)
		{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==frr[i])
			{
				flag=true;
			}
		}
		}
		if (flag)
		{
			System.out.println(flag);
		}
		else
		{
			System.out.println(flag);
			//no need to check remaining elements sobreakthe loop
		}
	}
}
