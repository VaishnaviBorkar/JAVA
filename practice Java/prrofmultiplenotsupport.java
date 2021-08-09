class A
{
	void print1()
	{
	  System.out.println("class A");
    }
}
class B 
{
	void print2()
	{
	  System.out.println("class B");
    }
}
class C extends A,B
{
	void print()
	{
	  System.out.println("class C sub class");
    }
	public void main(String args[])
	{
		C c=new C();
		c.print();
		c.print1();
		c.print2();
	}
}