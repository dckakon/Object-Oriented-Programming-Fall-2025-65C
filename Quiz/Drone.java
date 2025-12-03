//Abstraction 
//parent class/ base class/ super class
abstract class Drone{
    String modelName;  //default access modifier
    private int batteryCapacity; // data field+ methods-> Encapsulation

    //Constructor
    Drone(String modelName){
        this.modelName= modelName;
    }

    //set method 
    public void setBatteryCapacity(int batteryCapacity)
    {
        this.batteryCapacity= batteryCapacity;
    }
    //get method 
    public int getBatteryCapacity()
    {
       return batteryCapacity;
    }
    //abstract method -> no body
    abstract void displayInfo();
    abstract void fly();
}