package JavaEclipseCode;//Q.86 Reverse each word in given string

import java.util.Scanner;
class  ReverseWordsFromString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(); // hi hello
		String [] ar=str.split(" ");
		for (int i=0;i<ar.length ;i++ )
		{
			String rev="";
			String temp=ar[i];//hi
			for (int j=temp.length()-1;j>=0 ;j-- )
			{
			rev+=temp.charAt(j); //h
			}
			System.out.println(rev);// you can print using string
			ar[i]=rev;
			//System.out.println(ar[i]);//you can print using array before that save reverse string in it.
		}
	}
}
