//Overrid--can final class overrid.
final class Car
{
	String lable="BMW";
	int speed1=200;
    void speed()
	{
		System.out.println(lable+" speed is ="+speed1+"km/hr");
	}	
} 
class Vehical extends Car
{
	String lable="Bus";
	int speed1=100;
	void speed()
	{
		System.out.println(lable+" speed is ="+speed1+"km/hr");
	}	
	public static void main(String args[])
	{
		 Vehical v=new Vehical();
		 v.speed();
	}
}
//final class cannot be inherit....
