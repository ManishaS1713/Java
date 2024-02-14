package JavaEclipseCode;import java.util.Scanner;

class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int firstTerm=0, secondTerm=1, nextTerm=0;
		System.out.print("Enter range for fibonacci series: ");
		int num=sc.nextInt();

		//Print fibonacci series till Nth 
		for(int i=0;i<num;i++)
		{
			System.out.println(firstTerm);
			nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		
		//Print Nth fibonacci number
		int firstTerm1=0, secondTerm1=1, nextTerm1=0;
		for(int i=0;i<num-1;i++)
		{
			
			nextTerm1=firstTerm1+secondTerm1;
			firstTerm1=secondTerm1;
			secondTerm1=nextTerm1;
		}
		System.out.println(num+"th fibonacci number is "+firstTerm1);
	}
}
