// child class/ subclass
class DeliveryDrone extends Drone {

   /* DeliveryDrone(){
        System.out.println("Delivery Drone is created");
    } */

    // Constructor
    DeliveryDrone(String modelName)
    {   //this(); 
        super(modelName);//parent class -> constructor
    }
     
    // Implementing abstract method
    @Override
    void displayInfo() {
        System.out.println("-------Delivery Drone Information-------");
        System.out.println("Model Name: " + modelName);
        System.out.println("Battery Capacity: " + getBatteryCapacity() + " mAh");

    }
}