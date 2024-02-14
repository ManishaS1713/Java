package JavaEclipseCode;//Q.25 WAP to find digital product of the given number
//i/p=154 -> 1*5*4=20 is o/p 

import java.util.Scanner;
class  DigitalProduct
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter more than three digit number:- ");
		int num=sc.nextInt();
		int product=1;
		while(num!=0)
		{
			int temp=num%10;
			product*=temp;
			num/=10;
		}

		System.out.println("Digital Product is "+product);
	}
}
