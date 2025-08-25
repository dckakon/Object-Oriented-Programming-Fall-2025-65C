import java.lang.*;

public class MyCar{	
	
	String brand;
	String color;
	int year;
	
	//
	void drive(){  // user define function non-parameter
		System.out.println("Driving");
	}
	
	void start(String carBrand){ // parameter
		System.out.println(carBrand+" is Starting");
	
	}

	public static int addition (int a , int b){
		return a+b;
	}
	
	public static void main (String[] args){
		MyCar car1= new MyCar(); // object declare
					
		car1.brand="Toyota";  // initializtion class field
		car1.color="Red";
		car1.year=2021;
		
		System.out.println("Brand name-"+car1.brand+ " color="+car1.color ); // class field print
		
		MyCar car2= new MyCar();
		car2.brand="BMW";  // initializtion class field
		car2.color="Black";
		car2.year=2000;
		
		car1.drive();
		car1.start(car1.brand);
		

		int sum=addition(5,10);
		System.out.println("Sum is: "+sum);
		
		
	}
}