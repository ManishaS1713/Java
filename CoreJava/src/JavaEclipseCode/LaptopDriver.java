package JavaEclipseCode;import java.util.TreeSet;
import java.util.Comparator;

class Laptop implements Comparable
{
	String brand;
	int ram;
	double price;

	Laptop(String brand, int ram, double price) 
	{
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}

	@Override
		public String toString()
	{
		return "Brand:"+brand+", Ram: "+ ram +", Price: "+price;

	}

	@Override
		public boolean equals(Object o)
	{
		Laptop temp= (Laptop) o;
		if( this.ram==temp.ram && this.price==temp.price)
		{
			return true;
		}
		return false;
	}

	@Override
		public int  hashCode()
	{
		return ((Integer)ram).hashCode() + ((Double)price).hashCode();
	}

	@Override
		public int compareTo(Object o)
	{
		Laptop temp=(Laptop) o;
		if(this.ram>temp.ram  && this.price>temp.price)
		{
			return 1;
		}
		if(this.ram<temp.ram  && this.price<temp.price)
		{
			return -1;
		}
		return 0;
	}

}
class  LaptopDriver 
{
	public static void main(String[] args) 
	{
		TreeSet hs= new TreeSet();
		hs.add(new Laptop("Dell",4,100000));
		hs.add(new Laptop("HP",2,50000));
		hs.add(new Laptop("Lenovo",16,150000));
		
		for(Object o: hs)
		{
		System.out.println(o);
		}
	}
}
