
class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, String model, int doors) {
        super(brand, model);
        this.numberOfDoors = doors;
    }

    void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Doors: " + numberOfDoors);
        start();
    }
}

class Bike extends Vehicle {
    int engineCC;

    Bike(String brand, String model, int engineCC) {
        super(brand, model);
        this.engineCC = engineCC;
    }

    void displayBike() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine CC: " + engineCC);
        start();
    }
}

public class ex4 {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Innova", 4);
        Bike b = new Bike("Yamaha", "R15", 155);

        c.displayCar();
        b.displayBike();
    }
}
