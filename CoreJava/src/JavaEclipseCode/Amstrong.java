package JavaEclipseCode;

//Q.37 Check wherther the given number is Amstrong numberornot.
// 153=1^3+5^3+3^3=1+125+27=153
//24=2^2+4^2=4+16=20 which is not same so not amstrong number

import java.util.Scanner;
class  Amstrong
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			int num=sc.nextInt();//153
			int store=num;
			int comp=num;
			int sum=0;
			int n=0;
			//to get power value
			while(num!=0) //this while loop to calculate power value (p^n find n)
			{
				num/=10;
				n++;
			}
			// to get p^n+q^n
			for( int i=1; i<=n;i++) //this for loop to extract last digit
			{
				int pow=1;
				int t1= store % 10;
				for(int j=1;j<=n;j++)  //this for loop to calculate power
				{
					pow *=t1;  //power logic
					System.out.println("t1: "+t1+" pow "+pow);
					
				}
				store/=10;
				sum +=pow;  // addition logic

			}

			if (comp==sum)
			{

			System.out.println("Amstrong number");
			}
			else
			{
				System.out.println("Not Amsrong number");
			}
		}
	}
}
