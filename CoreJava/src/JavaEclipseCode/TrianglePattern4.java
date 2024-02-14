package JavaEclipseCode;/*
Q.6
*****
 ****
  ***
   **
    *
*/
class TrianglePattern4
{
	public static void main(String[] args) 
	{
		int cnt=0;
		for (int i=5;i>=1 ;i-- ) //for new row
		{	
			for (int j=cnt;j>=1 ;j-- ) //for space print
			{
				System.out.print(" ");
			}

			for (int j=i;j>=1 ;j-- ) //for * print
			{
				System.out.print("*");
			}
			System.out.println();
			cnt++;
		}
		
	}
}
