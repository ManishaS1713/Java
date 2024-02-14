package JavaEclipseCode;//Q.83 find the even length word in a sentence [string concept starts]

import java.util.Scanner;
class  EvenLengthWord
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String str=sc.nextLine();
		String [] ar=str.split(" "); //convert string into array
		System.out.println("Even length words are:-");
		for(int i=0;i<ar.length;i++)
		{
			int length=ar[i].length(); //findthe length of string
			if(length%2==0)
			{
				System.out.println(ar[i]);
			}
		}
	}
}
