package JavaEclipseCode;
//Q.49 WAP to create method area(int,String)
// where int is the size/radius
// String is the shape
//And find area of "circle" and "square" accordingly

import java.util.Scanner;
class  AreaMethod
{
	public static void area(double s, String shape)
		{
				if (shape.equalsIgnoreCase("circle")) //you can use equalsIgnoreCase() method or 
				{
					double area=3.14*s*s;
					System.out.println("Area of Circle is: "+area);
				}
				if (shape.equals("square"))
				{
					double area=s*s;
					System.out.println("Area of Square is: "+area);
				}
			
		}
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Type shape to calculate it's area:(circle/square) ");
			String ss=sc.next().toLowerCase();  //or you can use toLowerCase() method to convert into lower case internally
			System.out.println("Enter size/radius: ");
			double sr=sc.nextDouble();
			area(sr,ss);
		}
		
	}
}
