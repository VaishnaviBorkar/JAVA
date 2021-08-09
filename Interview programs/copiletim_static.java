//Overrid--proof static can't  method override by runtime polymorophism..
class Car
{   static void speed()
	{
		System.out.println("speed1 is 200/hr");
	}	
} 
class Vehical extends Car
{
	static void speed()
	{
		System.out.println("speed1 is 100/hr");
	}	
	public static void main(String args[])
	{
	     Vehical v=new Vehical ();
		 v.speed();
	}
}
//compile time can be possible...
 