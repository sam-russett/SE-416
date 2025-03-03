package Assignment_1;

public class UpdateVehicle {
    
    //Method for modifying the speed of any Vehicle object
    public void updateSpeed(Vehicle vehicle, int newSpeed) {
        vehicle.setSpeed(newSpeed);
        System.out.println("Updated speed: " + vehicle.getSpeed() + "mph");
    }
}
