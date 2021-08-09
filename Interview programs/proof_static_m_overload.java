//demo cam static method overloads?
class A{

     static void run(int b,int c)
	{
		System.out.println("addition is"+(b+c));
		
	}	
	 static void run(double x,double y)
	{
		System.out.println("addition is"+(x+y));
		
	}	
	public  static void main(String args[])
	{
		int x=10,y=20;
		double g=12.34,b=234.2;
		A a=new A();
		a.run(x,y);
		a.run(g,b);	
	}
}
//static method can be overloads...