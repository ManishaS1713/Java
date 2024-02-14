package JavaEclipseCode;//Q.30 WAP to check the given number is palindrome or not
//i/p is 1221 reverse is alsosame, so it is palindrome

class Palindrom
{
	public static void main(String[] args) 
	{
		int num=121;
		int rev=0;
		int copy=num;
		while (num>0)
		{
			int last=num%10;
				rev=rev*10+last;
					num/=10;
		}
		if(copy==rev)
		{
			System.out.println("Palindrom");
		}
		else
		System.out.println("Not Palindrom");
	}
}
