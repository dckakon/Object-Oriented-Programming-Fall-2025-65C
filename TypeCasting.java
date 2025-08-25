public class TypeCasting {
    public static void main(String[] args) {
      
        int num = 100;
        double doubleNum = num;  
        System.out.println("---Implicit Casting:----");
        System.out.println("Int value: " + num);
        System.out.println("Converted to double: " + doubleNum);

    
        double myDouble = 99.99;
        int myInt = (int) myDouble;  // double -> int
        System.out.println("\n---Explicit Casting:----");
        System.out.println("Double value: " + myDouble);
        System.out.println("Converted to int: " + myInt);


        char ch = 'A';
        int ascii = ch; // char -> int
        System.out.println("\n---Char to Int:---");
        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + ascii);



        int code = 66;
        char letter = (char) code; // int -> char
        System.out.println("\n---Int to Char:---");
        System.out.println("Int value: " + code);
        System.out.println("Character: " + letter);
    }
}
