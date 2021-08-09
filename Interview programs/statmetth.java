//q:can we acess not static method from static
//ans: not directly (yes by creating object)
class Stat{
	void method()
	{
		System.out.println("call through static meth");
	}
static void meth()
{
Stat n=new Stat();
n.method();
}
public static void main(String a[])
{
Stat n1= new Stat();
n1.meth();
}
}