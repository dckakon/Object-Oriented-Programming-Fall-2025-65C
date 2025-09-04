import java.lang.*; 

public class MainProduct{
      public static void main (String[] args){
        //user defined datatype- Product , //p1 -> object -> variable // String name;
        Product p1 = new Product(101,"Laptop",30000.00, "Asus Gaming laptop",50); //object creation
        Product p2= new Product(102,"Mobile", 20000.00,"Iphone", 200);     
        
        UserReview r1= new UserReview(1,101,"John","Good Product",4);
        UserReview r2= new UserReview(2,102,"Alice","Excellent",5);

        p1.displayInfo(); 
        r1.displayReview();
        
        p2.displayInfo();
        r2.displayReview();

    }
}

