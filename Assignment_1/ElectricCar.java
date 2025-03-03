package Assignment_1;

public class ElectricCar extends Car {
 
    public ElectricCar(String name, int speed, String make, String model) {
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
