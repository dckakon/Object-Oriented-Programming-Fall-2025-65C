class Main {
    public static void main (String args[]) {
        
        // creating object of DeliveryDrone
        DeliveryDrone deliveryDrone1 = new DeliveryDrone("DJI Mavic 2");
        deliveryDrone1.setBatteryCapacity(3850);
        deliveryDrone1.displayInfo();



        // creating object of SurveillanceDrone
        SurveillanceDrone surveillanceDrone1 = new SurveillanceDrone("Parrot Anafi");
        surveillanceDrone1.setBatteryCapacity(2700);
        surveillanceDrone1.displayInfo();
    }
}