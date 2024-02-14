package JavaEclipseCode;
//Q.87 capitalize each charater of each word in the given String
import java.util.Scanner;
class  CapitalizeStringWords
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		char [] str=str1.toCharArray();
		for (int i = 0; i < str1.length(); i++) 
		{ 
			if (str[i] >= 'A' && str[i] <= 'Z') 
			{
				str[i] = (char)(str[i] + 'a' - 'A'); 
			}
			else if (str[i] >= 'a' && str[i] <= 'z')
			{
				str[i]= (char)(str[i] + 'A' - 'a');
			}
		}
		System.out.println("Toggled string: ");
		for (int i = 0; i < str1.length(); i++) 
		{
			 System.out.print(str[i]);
		}
	}
}
