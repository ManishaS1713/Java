package JavaEclipseCode;//Q.47 SWAP two variable susing 3rd variable

import java.util.Scanner;
class SwapVariable
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st variable");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd variable");
		int num2=sc.nextInt();
		System.out.println("Num1 is "+num1+" Num2 is "+ num1);
		int num3;
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("SWAPED Num1 is "+num1+" SWAPED Num2 is "+ num2);
	}
}
