
// Base class --> any type of Vehicle
abstract class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public abstract void fuel();
    
    public void topSpeed() {
        System.out.println("Top speed is " + speed + "mph");
    }
}

class car extends Vehicle {

    protected String make;
    protected String model;

    public car(String name, int speed, String make, String model) {
        super(speed);
        this.make = make;
        this.model = model;
    }

    public void fuel() {
        System.out.println("Fueling " + make + " " + model + " with gasoline");
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
}