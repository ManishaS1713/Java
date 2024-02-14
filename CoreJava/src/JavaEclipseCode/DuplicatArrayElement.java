package JavaEclipseCode;//Q.55 find the duplicate elements in the given array

class DuplicatArrayElement 
{
	public static void main(String[] args) 
	{
		int [] ar={1,2,1,2,1,4};
		for(int i=0; i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println("Duplicate element is: "+ar[i]);
				}
			}
		}
	}
}
