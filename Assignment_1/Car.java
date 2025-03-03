package Assignment_1;

public class Car extends Vehicle {
    
    protected String make;
    protected String model;

    public Car(String name, int speed, String make, String model) {
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
