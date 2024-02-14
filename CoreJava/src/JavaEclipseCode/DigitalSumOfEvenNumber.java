package JavaEclipseCode;//Q.26 WAP to find Digital sum of even digits only in given number
// i/p is '4324' -> take even digits 4+2+4 -> 10 is o/p

import java.util.Scanner;
class  DigitalSumOfEvenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enternumber which is more than three digits:- ");
		int num=4324;
		int sum=0;
		while(num!=0)
		{
			int temp=num%10;
			if(temp%2==0) 
			{ 
				sum+=temp;
			}
			num/=10;
		}
		System.out.println("Digital sum of even digits:- "+sum);
	}
}
