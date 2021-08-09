
class Stat 
{
    public int x;
    static int y;
    void new1()
    {
      
    System.out.println("x"+x);
     x++;
    }
static void new2()
{
    System.out.println("y"+y);
        y++;
     
		Stat o=new Stat();
         o.new1();
		  o.new1();
		 System.out.println("x...."+o.x);
}
       
    
    public static void main(String[] args) 
	{
        Stat o=new Stat();
        
        o.new1();
        
        new2();
        new2();
		//System.out.println("main"+o.x);
}
     
    
    
}
