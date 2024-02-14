package JavaEclipseCode;
class A
{
	static String s ="Father";
	int a=10;
}
class B extends A
{
static String ss="Son";
int b=20;
}

class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(B.s); // access parent static member using sub-class name
		System.out.println(B.ss); // access its own class static member using class-name
		// System.out.println(B.a);  unable to access non-static membersof parent class
		
		B b1=new B();
		System.out.println(b1.a);
		System.out.println(b1.s);
		System.out.println(b1.b);
		System.out.println(b1.ss);
		
		A a1=new A();
		System.out.println(a1.a);
		System.out.println(a1.s);
		//System.out.println(a1.ss);  unable to access sub class static members
		//System.out.println(a1.b);   unable to access sub class non-static members
	}
}
