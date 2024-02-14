package JavaEclipseCode;//Q.90 swap twostring using thrid string.

import java.util.Scanner;
class  SwapString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string-1: ");
		String str1=sc.next();//hi
		System.out.println("Enter string-2: ");
		String str2=sc.next();
		String str3="";
		str3=str1;
		str1=str2;
		str2=str3;

		/*String str2=sc.next();//hello
		str1=str1+str2;//hihello
		str2=substring(str1.length()-1,str2.length()-1);//7,5 hello
		str1=substring(str1.length()-1,str2.length()-1);*/
		System.out.println("String-1"+str1+" String-2: "+str2);
	}
}
