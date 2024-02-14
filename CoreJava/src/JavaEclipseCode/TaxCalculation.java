package JavaEclipseCode;import java.util.Scanner;

class TaxCalculation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price of car");
		double price=sc.nextDouble();
		if(price<500000)
		{
			price=price*0.05;
			System.out.println(price+ " tax you have to pay");
		}
		if(500000 < price && price < 10000000 )
		{
			price=price*0.1;
			System.out.println(price+ " tax you have to pay");

		}
		if(price >1000000)
		{
			price=price*0.2;
			System.out.println(price+ " tax you have to pay");
		}
	}
}
