public class Product{   //default - private class  -> access modifier 1. private 2. public 3. protected 4. default
    int id;     // fields / properties
    String name;
    double price;
    String description;
    int quantity;

    Product (int id, String name, double price, String description, int quantity){     //constructor
        this.id= id;            // convention  
        this.name= name;
        this.price= price;
        this.description= description;
        this.quantity= quantity;
    }

    void displayInfo(){   // method / function
        System.out.println("--Product Details---");
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Price:"+price);
        System.out.println("Description:"+description);
        System.out.println("Quantity:"+quantity);
        System.out.println("------------------------");
    }

}