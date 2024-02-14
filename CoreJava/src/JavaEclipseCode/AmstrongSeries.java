package JavaEclipseCode;
//Q.38  Print all Amstrong numbersbetween 1 to N
// 153=1^3+5^3+3^3=1+125+27=153
//24=2^2+4^2=4+16=20 which is not same so not amstrong number
class  AmstrongSeries
{
	public static void main(String[] args) 
	{
		
		
		//int comp=100;
		int sum=0;
		System.out.println("Range of amstrong series from 1 to 100:  ");
		for( int i=1; i<=100;i++) 
		{
			int n=i;
			while(n>0)
			{

				int t1= n % 10;
				//System.out.println("t1: "+t1);
			
				sum +=t1*t1*t1;  
				n/=10;
				//System.out.println("sum: "+sum);
				if (sum==i)
				{
					System.out.println(sum);
				}
		
			}
			sum=0;
		 }
		
	}
}
