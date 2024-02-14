package JavaEclipseCode;//Q.54 find the average of all the elementsin the given array
import java.util.Scanner;
class  AverageOfArray
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length: ");
		int n=sc.nextInt();
		int[] ar=new int[n];
		int sum=0;
		System.out.println("Enter array element till "+n+": ");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
			
		}
		int avg=sum/n;

		System.out.println("Average is: "+avg);
	}
}
