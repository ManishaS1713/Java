package JavaEclipseCode;
//Q.50 WAP to declare and initialize an array using new keyword

import java.util.Scanner;
class  ArrayDeclareInitialize
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			int [] ar=new int[5];   //using new keyword
			for(int i=0;i<ar.length;i++)
			{
				ar[i]=sc.nextInt();
			}
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(" a["+i+"] ="+ar[i]);
			}
		}
	}
}
