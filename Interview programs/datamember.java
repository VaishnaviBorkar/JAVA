//Data member cant be overriden so we cant achive plymorphism with data member..
class A
{
	int x=20;
}
class B extends A
{
	int x=45;
	public static void main(String s[])
	{
		A b =new B();
		System.out.println(b.x);   //20 not execute overriden method..
	}
}