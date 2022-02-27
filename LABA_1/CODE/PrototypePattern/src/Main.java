import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nWelcome to the production of transport");
        System.out.println("We produce cars and buses");
        System.out.println("What would you like to order from us?");
        System.out.println("1. Bus: \n\tbrand: bus_brand, model: bus_model, color: bus_color, doors: 4");
        System.out.println("2. Car: \n\tbrand: car_brand, model: car_model, color: car_color, top speed: 250");
        System.out.print("Your answer: ");

        int answer;
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextInt();

        //Original vehicles
        List<Vehicle> vehicles = List.of(
                new Bus("bus_brand", "bus_model", "bus_color", 4),
                new Car("car_brand", "car_model", "car_color", 250)
        );

        //Cloned vehicles
        List<Vehicle> copyList = new ArrayList<>();

        switch (answer) {
            case 1 -> {
                System.out.println("how many buses?");
                System.out.print("Your answer: ");
                answer = scanner.nextInt();
                for (int i = 0; i < answer; i++) {
                    copyList.add(vehicles.get(0).clone());
                }
            }
            case 2 -> {
                System.out.println("how many cars?");
                System.out.print("Your answer: ");
                answer = scanner.nextInt();
                for (int i = 0; i < answer; i++) {
                    copyList.add(vehicles.get(1).clone());
                }
            }
        }

        System.out.println("\n~~~~~~~~~~~~~~~ORIGINAL~~~~~~~~~~~~~~~\n");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString() + vehicle.hashCode());
        }

        System.out.println("\n~~~~~~~~~~~~~~~~CLONED~~~~~~~~~~~~~~~~\n");
        for (int i = 0; i < copyList.size(); i++) {
            System.out.println((i+1) + ". " + copyList.get(i) + copyList.get(i).hashCode());
        }
    }
}
