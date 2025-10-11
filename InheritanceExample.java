// Superclass
class Person {
    String name;
    int age;


    // Method to display person info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;


    void displayTeacherInfo() {
        System.out.println("Teacher Information:"); 
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Alice";
        t1.age = 30;
        t1.subject = "Mathematics";
        t1.displayTeacherInfo();
    }
}
