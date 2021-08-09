//Astract class can contain static variables,,YES
abstract class Member {
	static int x=44;
	abstract void Add();
		
}
class Test extends Member{
 void Add()
		{
			System.out.println("PROGRAM RUN SUCCESSFUL!");
		}
	public static void main(String args[])
	{
	
		Member b=new Test();
		b.Add();
		System.out.println("\nabstract method cannt be static method");
		System.out.println(Member.x);
		
	}
}
//bcz variables cant override and not abstract..