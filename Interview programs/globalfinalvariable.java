class A{
	static final int x;
	void display()
	{ 
		System.out.println("x="+x);
	}
	static
	{
		x=20;
	}
	
	public static void main(String args[])
	{
		A a=new A();
		A b=new A();
		a.display();
		
	}
	
}