class A1{
	 final int x=20;
	void display()
	{ 
		System.out.println("x="+x);
	}
}
	class A2 extends A1{

	void printm()
	{ 
		System.out.println("x="+x);
	}
	public static void main(String args[])
	{
		A2 a=new A2();
		a.display();
	    a.printm();
	   
		
	}
	
}