package JavaEclipseCode;
//Q.65 to search an element using linear search

import java.util.Scanner;
class  ArrayLinearSearch
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int [] ar={1,2,3,4,5,6,6};
		System.out.println("Enter element ");
		int num=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<ar.length;i++)
		{
			if(num==ar[i])
			{
				flag=true;
			}
		}
		if (flag)
		{
			System.out.println(num+" present");
		}
		else 
		{
			System.out.println(num+" Not Present");
		}
	}
}