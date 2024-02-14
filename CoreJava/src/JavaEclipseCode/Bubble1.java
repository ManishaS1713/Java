package JavaEclipseCode;class Bubble1 
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,5,3,0};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0;j<arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		//	System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}
}

