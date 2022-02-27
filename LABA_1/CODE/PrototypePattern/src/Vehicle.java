public abstract class Vehicle{
    private String brand;
    private String model;
    private String color;

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public abstract Vehicle clone();

    @Override
    public String toString() {
        return this.getClass() +
                ": { Brand: " + brand +
                ", Model: " + model +
                ", Color: " + color;
    }
}
