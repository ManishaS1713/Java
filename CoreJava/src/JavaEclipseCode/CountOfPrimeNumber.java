package JavaEclipseCode;//Q.36 WAP to find how many prime numbers are present in the given number
//4543 -> two -> 5 and 3

import java.util.Scanner;

class  CountOfPrimeNumber
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number which is more than three digit: ");
		int num=sc.nextInt();//4543
		int cnt=0;
		while(num!=0)
		{ 
			int temp=num%10;
			num/=10;
		
				if(temp==2 || temp==3 ||temp==5 ||temp==7) 
				{
					cnt++;
				}
							
		}	
			System.out.println(cnt+" Prime number present");

			//OR

		/*
		int pcount=0;
		while(num!=0)
		{
			int temp=num%10;
			for(int i=2;i<temp;i++)
			{
				if(temp%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				pcount++;
			}
				num/=10;
		 }
		 System.out.println(pcount);*/
		
			
	}		
}

