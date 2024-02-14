package JavaEclipseCode;//Q.66 Reverse the array elements

class  ArrayReverseElement
{
	public static void main(String[] args) 
	{
		int [] ar={1,2,3,4,5,6};
		int [] rev=new int[ar.length];
		System.out.println("Original array is: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("Reverse array is: ");
		for(int i=ar.length-1;i>=0;i--) // length-1 because index start from zeroand length count from 1. So it will throws exception
		{
			rev[i]=ar[i];
			System.out.println(rev[i]);
		}
	}
}