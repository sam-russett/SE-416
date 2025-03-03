package Assignment_1;

// Some example use cases of the Data and Stamp coupling
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Mustang", 120, "Ford", "GT");
        Airplane myPlane = new Airplane("Boeing 747", "35000 ft", 570);
        
        UpdateVehicle service = new UpdateVehicle();

        // Stamp coupling: passing objects and speed values as parameters
        service.updateSpeed(myCar, 150);
        service.updateSpeed(myPlane, 600);

        //Data coupling: passing in integer values as arguments to another method
        int distanceTraveled = myCar.getDistance(myCar.getSpeed(), 2);
        System.out.println("Maximum distance example car can travel in 2 hours: " + distanceTraveled + " miles");
    }
}