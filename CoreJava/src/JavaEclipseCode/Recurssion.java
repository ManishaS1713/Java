package JavaEclipseCode;import java.util.Scanner;

class Recurssion 
{
	//WAP to find factorial of given number using method recurssion

	static int factorial( int f)
	{
		if (f>1)
		{
			f=f*factorial(f-1);
			return f;
		}
		else
		{
			return 1;
		}
	}

	int add( int a)
	{
		if (a>0)
		{
			return a+add(a-1);
		}
		else 
		{
			return 1;
		}
	}

	int div( int a)
	{
		if ((a>1))
		{
			return (a/div(a-1));
		}
		else
		{
			return 1;
		}
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number: ");
		int l=s.nextInt();

		Recurssion r1=new Recurssion();

		int fact=factorial(l);
		System.out.println("Factorial recurssion is: "+ fact);
		
		
		int result= r1.add(l);
		System.out.println("Addtion recurssion is: "+result);

		int div=r1.div(l);
		System.out.println("division recurssion is: "+div);
	}
}
