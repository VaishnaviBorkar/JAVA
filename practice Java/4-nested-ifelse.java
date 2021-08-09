import java.util.Scanner;
class GreaterNumber{
    public static void check(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int x=sc.nextInt();
         System.out.println("Enter the Second Number :");
        int y=sc.nextInt();
         System.out.println("Enter the Third Number :");
        int z=sc.nextInt();
         System.out.println("Your Input Is \n X="+x+" Y="+y+" Z="+z);
        if(x>y){
            if(x>z){
                  System.out.println("X is greater");
            }
        }
            else{
                if(y>z)
                {
                     System.out.println("Y is greater");
                }
                else{
                     System.out.println("Z is greater");
                }
            }
        
    }
    public static void main(String args[]){
       GreaterNumber.check();
    }

}