package Assignment_1;

public class Airplane extends Vehicle {
    
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
