package JavaEclipseCode;class Watch
{
	String brand;
	double price;
	String type;
	String shape;

	Watch(String brand, double price, String type,String shape) 
	{
		this. brand=brand;
		this.price=price;
		this.type=type;
		this.shape=shape;
	}

	public String toString()
	{
		return "Brand: "+brand+", Price: "+price+", Type: "+type+", Shape: "+shape;
	}
	public boolean equals(Object o)
	{
		Watch temp=(Watch) o;
		if(this.brand == temp.brand)
		{
			return true;
		}
		return false;
	}
	public int hashCode(Object o) 
	{
		return brand.hashCode();
	}
}


class  WatchDriver
{
	public static void main(String[] args) 
	{
		Watch w1=new Watch("Titan", 1000, "analog", "circle");
		Watch w2=new Watch("Titan", 1000, "Digital", "circle");
		Watch w3=new Watch("Raga", 500, "Digital", "Hexagone");
				
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);

	}
}
