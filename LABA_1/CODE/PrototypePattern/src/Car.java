public class Car extends Vehicle{

    private int topSpeed;

    public Car(String brand, String model, String color, int topSpeed) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
    }
    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return super.toString() + " Top Speed: " + topSpeed + " }\t";
    }
}
