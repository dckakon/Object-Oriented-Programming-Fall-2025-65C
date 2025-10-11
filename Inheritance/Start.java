// Superclass/ Parent Class
class A {

    A (){

        System.out.println("Constructor A");
    }

    A(int x)
    {
        System.out.println("Parameterized Constructor A="+x);
    }

    void display(){
        System.out.println("Display A");
    }
}

// sub class/Child class B inherits class A, 
class B extends A {  

    B(){
        System.out.println("Constructor B");
    }

    B(int y){
        this();
        System.out.println("Parameterized Constructor B="+y);
    }
   B(int x,int y, int z){
        this();
        System.out.println("Parameterized Constructor B="+(x+y+z));
    }
    @Override
    void display(){
        super.display(); // this section calls the display method of Class A , even though the method was overridden
        System.out.println("Display B");
    }

}

public class Start {
    public static void main(String[] args)
    {
        B obj1 = new B(); // This will print, Constructor A, Constructor B
        B obj2 = new B(5);// This will also print, Constructor A, Constructor B, Parameterized Constructor B=5
        B obj3 = new B(4,2,1);
        obj1.display();// this should print Display B, but as the super.display() method was used inside the Display method, ,
        // this will print Display A, Display B
    }
}
