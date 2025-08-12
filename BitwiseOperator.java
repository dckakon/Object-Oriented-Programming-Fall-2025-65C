import java.lang.*;


public class BitwiseOperator {

    public static void main(String[] args) {
        int a = 12;  // Binary: 1100
        int b = 7;   // Binary: 0111
        
        System.out.println("a & b: " + (a & b));  // 1100 & 0111 = 0100 (4)
        
 
        System.out.println("a | b: " + (a | b));  // 1100 | 0111 = 1111 (15)
        

        System.out.println("a ^ b: " + (a ^ b));  // 1100 ^ 0111 = 1011 (11)
     
    }
}