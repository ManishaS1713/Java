package JavaEclipseCode;
// 67.1 Check frequency of an array elements

import java.util.Arrays;
class  ArrayFreequency_check
{
	public static void main(String[] args) 
	{
		int [] arr={1,1,2,3,2,3,2};
		int [] frr=new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					frr[j]=visited;	//most important line of this program
					count++;
				}
			}
			
			if(frr[i]!=visited)
			{
				frr[i]=count;
			}
		}

			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(frr));
		for(int i=0;i<arr.length;i++)
		{
			if(frr[i]!=visited)
			System.out.println(arr[i]+"="+frr[i]);
		}

	}
}
