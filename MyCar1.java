import java.lang.*;

public class MyCar1{	
	
	String brand;
	int year;
	
	MyCar1(){  // constructor
		System.out.println("This is my car");
	}

	MyCar1(String brand, int year){  // constructor
		this.brand=brand;
		this.year=year;
	}

	void show(String brand){
		System.out.println("Brand name-"+this.brand);

	}

	void show(){
		System.out.println("Brand name-"+this.brand);

	}
	 
	public static void main (String[] args){
		MyCar1 car1= new MyCar1();
		car1.brand="BMW";
		car1.year=2020;
		
		car1.show(car1.brand);

		MyCar1 car2= new MyCar1("Audi", 2021);
		car2.show();
	}
}