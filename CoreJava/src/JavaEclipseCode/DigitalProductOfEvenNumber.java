package JavaEclipseCode;//Q.27 WAP to find Digital product of even digits only in given number
// i/p is '4324' -> take even digits 4*2*4 -> 32 is o/p

import java.util.Scanner;
class  DigitalProductOfEvenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enternumber which is more than three digits:- ");
		int num=4324;
		int product=1;
		while(num!=0)
		{
			int temp=num%10;
			if(temp%2==0) 
			{ 
				product*=temp;
			}
			num/=10;
		}
		System.out.println("Digital sum of even digits:- "+product);
	}
}
