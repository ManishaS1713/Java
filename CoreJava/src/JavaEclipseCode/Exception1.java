package JavaEclipseCode;import java.util.*;

class Exception1 
{
	public static void main(String[] args) 
	{
		String s=null;
		TreeSet hs=new TreeSet();
	hs.add(1);

		try
		{
			//System.out.println(str.());
			Iterator i= hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		}
		catch ( NullPointerException e)
		{
			System.out.println(" null value cannot casted");
		}
		catch (NoSuchElementException e1)
		{
			System.out.println(" No such element present");
		}
		
	}
}

