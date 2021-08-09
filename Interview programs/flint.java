//fload a, int a variable
class A 
{
	int a=10;
	//float a=20; cterror:already defined a
	A()
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		
		A b=new A();
		System.out.println(b.a);
	}
}