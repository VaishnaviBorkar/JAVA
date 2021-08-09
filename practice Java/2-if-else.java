//2.Write a program in java to demonstrate if else statement.
import java.util.Scanner;
class Demo2
{
	public void display(int x)
	{
		if(x>=18)
		{
			System.out.print("You Are Illigible For Votting !");
		}
		else{
		System.out.println("You Are Not Illigible For Votting !");
		}
	}
	public static void main(String k[])
	{
		int x;
		System.out.println("Enter any Integer Number : ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		Demo2 d1=new Demo2();
		d1.display(x);
	}
}

// D:\java programs\A_college_Practicals\new list>java Demo2
// Enter any Integer Number :
// 3
// You Are Not Illigible For Votting !