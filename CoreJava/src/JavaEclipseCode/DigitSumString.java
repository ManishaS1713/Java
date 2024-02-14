package JavaEclipseCode;//Q.84 WAP to calculate the sum of digits in the string.
//e.g. Fs8g6huo/p should be 14

import java.util.Scanner;
class DigitSumString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphanumeric string: ");
		String str=sc.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch>='0' && ch<='9')
			{
				sum+=(ch-48); //ASCII value of 0 is 48----->ASCII value of 1 is 1+48=49--so--1=49-48
			}

		}
		System.out.println("Sum is: "+sum);
	}
}

//95=
//65=
//48=