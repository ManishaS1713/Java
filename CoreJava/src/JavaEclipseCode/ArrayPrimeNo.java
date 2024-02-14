package JavaEclipseCode;
//Q.64 print only prime numbers from an array

class  ArrayPrimeNo
{
	public static void main(String[] args) 
	{
		int [] ar={1,2,3,4,5,6,9,12,13,15};
		
		for(int i=0; i<ar.length; i++)
		{
			int cnt=0;
			for(int j=1;j<=ar[i];j++) // we have to pick value from the array socompare with element not with length
			{
				
				if(ar[i]%j==0)
				{
					cnt++;
					
				}

			}
			if(cnt==2)
			{
				System.out.println(ar[i]);
			}
		}
		
		
	}
}