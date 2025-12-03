class SurveillanceDrone extends Drone {
        
    // constructor
    SurveillanceDrone(String modelName) {
        super(modelName); // calling parent class constructor
    }

    // Implementing abstract method
    @Override
    void displayInfo(){
        System.out.println ("-------Surveillance Drone Information-------");
        System.out.println("Model Name: " + modelName);
        System.out.println("Battery Capacity: " + getBatteryCapacity() + " mAh");
    }
}