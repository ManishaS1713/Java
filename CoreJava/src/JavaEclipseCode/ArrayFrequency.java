package JavaEclipseCode;
//Q.67 find the frequency of each element in an array

import java.util.HashSet;
class  ArrayFrequency
{
	public static void main(String[] args) 
	{
		int [] ar={1,1,1,2,2,3,3,3,4,5,5,6};
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<ar.length;i++)  //add element into the Hashset
		{
			hs.add(ar[i]);
		}

		//compare HshSet element and array element
		for (int h : hs )
		{
			int count=0;
			for(int i=0;i<ar.length;i++)
			{
				if(h==ar[i])
				{
					count++;
				}
			}
		System.out.println(h+" : "+count);
		}
	}
}