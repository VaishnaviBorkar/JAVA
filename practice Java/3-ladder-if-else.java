import java.util.Scanner;
class Marks{
     public void ckeck_grade(int marks){
         if(marks<30){
             System.out.println("Student is fail");
         }
         else if(marks>=30 && marks<40){
                System.out.println("Student is fail");
         }
         else if(marks>=40 && marks<50){
                 System.out.println("Student is fail");
         }
         else if(marks>=50 && marks<60){
                 System.out.println("D Grade");
         }
         else if(marks>=60 && marks<70){
                 System.out.println("C Grade");
         }
         else if(marks>=70 && marks<80){
                  System.out.println("B Grade");
         }
         else if(marks>=80 && marks<90){
                  System.out.println("A Grade");
         }
         else if(marks>=90 && marks<100){
                 System.out.println("Distinction");
         }
         else{
              System.out.println("Invalid Input");
         }
     }
    public static void main(String[] args){
        Marks m=new Marks();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks :");
        int marks=sc.nextInt();
        m.ckeck_grade(marks);
        // System.out.println(marks);

    }
}