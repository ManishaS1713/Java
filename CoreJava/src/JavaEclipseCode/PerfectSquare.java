package JavaEclipseCode;//Check if a number is PERFECT SQUARE or not (1,4,9,16)
//n=4;4/2=2;2*2=4 ->so 4 is perfect square
//n=9;27/3=9;3*3*3=27->so 9 is perfect square
//n=2;2/2=1;1*1!=2 ->so 2 is not perfect square

import java.util.Scanner;

class  PerfectSquare
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=1;i*i<=n;i++)
		{
			if(i*i==n)
			{
				flag=true;
			}
			
			
		}
		if (flag)
		{
			System.out.println("Perfect square");
		}
		else 
		{
				System.out.println("Not perfect square");
		}
		
	}
}
