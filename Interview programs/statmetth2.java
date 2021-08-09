class Stat{
static void meth()
{
	System.out.println("static");
}
}class Bat extends Stat
{
public static void main(String a[])
{
	Bat w =new Bat();
	Stat.meth();
System.out.println("static");
}
}