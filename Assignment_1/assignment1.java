package Assignment_1;

// Base class --> any type of Vehicle
abstract class Vehicle implements startVehicle {
    protected int speed;

    public Vehicle(int speed) {
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
}

class car extends Vehicle{

    protected String make;
    protected String model;

    public car(String name, int speed, String make, String model) {
        super(speed);
        this.make = make;
        this.model = model;
    }

    public void fuel() {
        System.out.println("Fueling " + make + " " + model + " with gasoline until tank is full");
    }

    public void fuel(int amount) {
        System.out.println("Fueling " + make + " " + model + " with " + amount + " gallons of gasoline");
    }

    public void topSpeed() {
        System.out.println("Top speed for " + make + " " + model + " is " + speed + "mph");
    }
}

class Airplane extends Vehicle {

    protected String name;
    protected String altitude;

    public Airplane(String name, String altitude, int speed) {
        super(speed);
        this.name = name;
        this.altitude = altitude;
    }

    public void fuel() {
        System.out.println("Fueling " + name + " with jet fuel");
    }

    public void topSpeed() {
        System.out.println(name + " flies at top speed of " + speed + " and altitude of " + altitude);
    }
}

class electricCar extends car {
    
    public electricCar(String name, int speed, String make, String model) {
        super(name, speed, make, model);
    }

    public void fuel() {
        System.out.println("Charing " + make + " " + model);
    }

    @Override
    public void startEngine() {
        System.out.println("Electric car has no engine, turning on motors...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric car has no engine, turning off motors...");
    }
}