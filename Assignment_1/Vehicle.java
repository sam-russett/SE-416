package Assignment_1;

// Base class --> any type of Vehicle
abstract class Vehicle implements IStartVehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void fuel();
    
    public void topSpeed() {
        System.out.println("Top speed is " + speed + "mph");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine...");
    }

    //Example of Data Coupling
    public int getDistance(int speed, int time) {
        return calculateDistance(speed, time);
    }

    public int calculateDistance(int speed, int time) {
        return speed * time;
    }
}