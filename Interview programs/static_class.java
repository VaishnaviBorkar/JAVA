//can we inherit static class?,No
static class A {
     	static  void Add()
	{
		System.out.println("hellow");
	}
}
class B extends A{
	public static void main(String args[])
	{
		B b=new B();
		b.Add();
		System.out.println("PROGRAM not RUN!\nwe cannt inherit static class\nin othhe words,we cant define a class as static");
	}
}