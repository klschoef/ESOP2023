package classes;

//Note: this example has been generated with ChatGPT

public class Car {
    // Properties of the Car
    String color;
    String brand;
    int speed;

    // Constructor to initialize a new Car object
    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
        this.speed = 0; // Cars are stationary by default
    }

    // Method to accelerate the car
    public void accelerate(int increment) {
        speed += increment;
    }

    // Method to apply brakes
    public void brake() {
        speed = 0;
    }

    // Method to display the state of the car
    public void displayState() {
        System.out.println("The " + color + " " + brand + " is moving at " + speed + " km/h.");
    }
}

