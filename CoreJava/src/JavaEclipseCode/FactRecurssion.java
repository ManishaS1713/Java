package JavaEclipseCode;//factorial of N using method recurssion
import java.util.Scanner;

class  FactRecurssion
{
	public static int factorial(int fact)
	{
		if(fact>1)
		{
			return fact*factorial(fact-1);
		}
		else
		{
		return 1;
		}	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for factorial: ");
		int num=sc.nextInt();
		System.out.println("Factorial is="+ factorial(num));
		
	}
}
