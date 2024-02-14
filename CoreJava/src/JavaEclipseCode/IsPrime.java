package JavaEclipseCode;
import java.util.Scanner;
class IsPrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int cnt=0;
		for(int i=1;i<=num;i++)
		{
			
			if(num%i==0) 
			{
				cnt++;
			}
		}
		
			if (cnt==2)
			{
				System.out.println(num+" is Prime number");
			}
			else
			{
				System.out.println(num+" iIsPrimes not Prime number");
			}
		
	}
}
