//constructor cant be static
class Con{
static Con()
	{
		System.out.printn("construct");
	}
	public static void main(String args[])
	{
		Con c=new Con();
	}
}