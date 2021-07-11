package s7.ce39;

public class Car {
    private String make;
    private String model;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String make, String model, int cylinders) {
        this.make = make;
        this.model = model;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Car Engine Started!");
    }

    public void accelerate() {
        System.out.println("Car Is Now Accelerating...");
    }

    public void brake() {
        System.out.println("Car Brakes Applied!");
    }
}

class MahindraMarazzo extends Car {

    public MahindraMarazzo(String make, String model, int cylinders) {
        super("Manindra", "Marazzo", 4);
    }

    @Override
    public void accelerate() {
        System.out.println(this.getMake() + " " + this.getModel() + " accelerating...");
    }

    @Override
    public void brake() {

        System.out.println(this.getMake() + " " + this.getModel() + " stopped!");
    }

    @Override
    public void startEngine() {
        System.out.println(this.getMake() + " " + this.getModel() + " started!");
    }

}

class ToyotaFortuner extends Car {

    public ToyotaFortuner(String make, String model, int cylinders) {
        super("Toyota", "Fortuner", 4);
    }

    @Override
    public void accelerate() {
        System.out.println(this.getMake() + " " + this.getModel() + " accelerating...");
    }

    @Override
    public void brake() {

        System.out.println(this.getMake() + " " + this.getModel() + " stopped!");
    }

    @Override
    public void startEngine() {
        System.out.println(this.getMake() + " " + this.getModel() + " started!");
    }
}

class HyundaiVerna extends Car {

    public HyundaiVerna(String make, String model, int cylinders) {
        super("Hyundai", "Verna", 4);
    }

    @Override
    public void accelerate() {
        System.out.println(this.getMake() + " " + this.getModel() + " accelerating...");
    }

    @Override
    public void brake() {

        System.out.println(this.getMake() + " " + this.getModel() + " stopped!");
    }

    @Override
    public void startEngine() {
        System.out.println(this.getMake() + " " + this.getModel() + " started!");
    }
}