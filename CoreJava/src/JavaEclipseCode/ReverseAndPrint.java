package JavaEclipseCode;//Q.28 WAP to reverse a number and print it.

import java.util.Scanner;
class ReverseAndPrint 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit number");
		int num=sc.nextInt();
		System.out.print("Reverse number is ");
		while(num!=0)
		{
			int last=num%10;
			System.out.print(last);
			num/=10;
		}
	}
}
