//throw unchecked exception and use try catch block propogated..
class Uncheck
{
	void n()//throws java.lang.ArithmeticException without throws
	{
		int x=22/0;
	throw new java.lang.ArithmeticException("exception cought");
		
	}
	void p() throws java.lang.ArithmeticException
	{
		n();
	}
	public static void main(String args[])
	{    try{
		 Uncheck u=new Uncheck();
		
		 u.p();
		 }catch(Exception e)
		 {
			 	System.out.println("got");
		 }
		System.out.println("rest of the code");
	}
}