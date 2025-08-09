import java.lang.*;

public class StudentID{

	public static void main(String[] args){
		
	String name;
	int id, age;
	double gpa;
	boolean isRegistered;
	char c='c'; // dynamic initialization
	
	name = "Alex";
	id= 1235;
	age=25;
	gpa=3.2;
	isRegistered=true;
	
	//using Println function	
	
	System.out.println("Student Information");
	System.out.println("-------------------");
	System.out.println("Name-"+name+ "\t This is my name" );
	System.out.println("ID-"+id);
	System.out.println("AGE-"+age);
	System.out.println("GPA-"+gpa);
	System.out.println("Registered: "+isRegistered);
	System.out.println("Character: "+c);
	
	
	// Println	
	
	System.out.println("Student Information");
    System.out.println("--------------------");
	
	
	// using Printf function (same as C program)
	
    System.out.printf("Name: " +name);
    System.out.printf("Name: %s\n",name); // format specifier
    System.out.printf("ID : %d: \n",id); // format specifier
    System.out.printf("Age: %d\n",age); // format specifier
    System.out.printf("GPA: %.2f\n",gpa); // format specifier
    System.out.printf("Registered: %b\n",isRegistered); // format specifier
	
	}

}