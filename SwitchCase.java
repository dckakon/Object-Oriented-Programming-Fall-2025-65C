import java.lang.*;
public class SwitchCase {   

   public static void main(String args[]) {
      char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent"); 
            break;
         case 'B' :
            System.out.println("Good"); 
            break;
         case 'C' :
            System.out.println("Well done");
            break;
         case 'F' :
            System.out.println("Fail");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}