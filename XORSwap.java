public class XORSwap {
    public static void main(String[] args) {
        int a = 5;//   0 1 0 1
        int b = 10; // 1 0 1 0

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a ^ b; // 1 1 1 1

        b = a ^ b; // 0 1 0 1

        a = a ^ b; //1 0 1 0

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}