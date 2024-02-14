package JavaEclipseCode;//Q.62 print vowels from an array

class  ArrayVowel
{
	public static void main(String[] args) 
	{
		char [] ar={'a','e','p','l','o','m'};
		System.out.println("Vowels from array: ");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]=='a' || ar[i]=='e' || ar[i]=='i' || ar[i]=='o' || ar[i]=='u')
			{
				System.out.println(ar[i]);
			}
		}
	}
}
