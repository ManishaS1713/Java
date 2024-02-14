package JavaEclipseCode;//print 1 to 100 prime number
class Prime 
{
	public static void main(String[] args) 
	{
		
		for(int n=10; n<=80; n++)
			{
				int c = 0;
		for (int i = 1; i <= n; i++)
			{
				if (n % i == 0)
				c++;
			}
				if (c == 2)
					{
						System.out.print(" "+n);
  					}
			}
	}
}
