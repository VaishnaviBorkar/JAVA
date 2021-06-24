/*Task part II-Create a program that helps someone at a restaurant calculate tips for the cost of their
food*/
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
class Ctips
{
	public static void main(String args[])
	{
		double cost,stotal,tax;
		int count;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter the cost of the meal:");
		cost=sc.nextDouble();
		System.out.println("\nMeal\t : $"+Math.round(cost*100.0)/100.0);
		       // printf("....printffff\n10% tip\t : $%1lf",((cost*10)/100));
                System.out.println("\n10% tip\t : $"+Math.round(((cost*10)/100)*100.0)/100.0);
                System.out.println("\n15% tip\t : $"+Math.round(((cost*15)/100)*100.0)/100.0);
                System.out.println("\n20% tip\t : $"+Math.round(((cost*20)/100)*100.0)/100.0);
	
        }
}        
/*
run:

Please enter the cost of the meal:236.56

Meal	 : $236.56

10% tip	 : $23.66

15% tip	 : $35.48

20% tip	 : $47.31
BUILD SUCCESSFUL (total time: 18 seconds)

*/