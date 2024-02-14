package JavaEclipseCode;//Q.59 copy 1 array into another array
class  CopyArray
{
	public static void main(String[] args) 
	{
		int [] ar={1,2,3,4,5};
		int []br=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			br[i]=ar[i];
		System.out.println(br[i]);
		}
	}
}
