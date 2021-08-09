/*wap to demo of sanner class in java
calculate area of rectangle*/
 import java.util.*;
 class Rectangle
 {  
	double length,breadth;
	void getdata(double l,double b)
	{
		length=l;
		breadth=b;
	}
	void calculate()
	{
		System.out.println("AREA OF RECTANGLE IS:"+(length*breadth));
	}
	public static void main(String args[])
	{
		Rectangle ob=new Rectangle();
		Scanner s=new Scanner(System.in);
		double len=s.nextDouble();
		double bred=s.nextDouble();
		ob.getdata(len,bred);
		ob.calculate();
	}
 }
 