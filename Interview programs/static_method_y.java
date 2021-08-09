// can contain static methods,YES
abstract class A {
	static void Add()
		{
			System.out.println("PROGRAM RUN SUCCESSFUL!");
		} 
}
class B extends A{

	public static void main(String args[])
	{
		A b=new B();
		b.Add();
		System.out.println("\n method in abstract class can be static method");
		
	}
}
