//volume of sphere 2pi.r.r.r using static main method..
import java.util.Scanner;
class volume
{  
    public static void main(String argS[])
    {
		int r;
	   final double pi=3.14;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the radius of sphere:");
	   r=sc.nextInt();
	   System.out.println("volume of sphere is:"+(2*pi*r*r*r));
    }
	
}