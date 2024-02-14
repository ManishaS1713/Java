package JavaEclipseCode;class ForLoop1 
{
	public static void main(String[] args) 
	{
		System.out.println(" star square");
		for( int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
			System.out.print("* ");

			}
			System.out.print(" \n");
		}
		System.out.println("star triangle");
		for( int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
			System.out.print("* ");

			}
			System.out.print(" \n");

		}
		
		System.out.println(" left triangle star");
		for( int i=0; i<5; i++)
		{
			for(int j=2*(5-i); j>=0; j--)
			{
			System.out.print(" ");

			}
			for(int k=0; k<=i; k++)
			{
			System.out.print(" *");
			}
			System.out.println("");
		}
		System.out.println(" pyramid triangle star");
		for( int i=0; i<5; i++)
		{
			for(int j=(5-i); j>=0; j--)
			{
			System.out.print(" ");

			}
			for(int k=0; k<=i; k++)
			{
			System.out.print(" *");
			}
			System.out.println("");
		}
		
	}
}
