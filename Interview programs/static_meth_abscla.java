//abstract class can contain static methods,YES
abstract class A {
	static int x=44;
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
		System.out.println("\nabstract method cannt be static method");
		System.out.println(A.x);
		
	}
}
