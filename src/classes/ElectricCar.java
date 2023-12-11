package classes;

//Note: this example has been created with of ChatGPT

public class ElectricCar extends Car {
    int batteryCapacity; // Additional property unique to ElectricCar

    public ElectricCar(String color, String brand, int batteryCapacity) {
        super(color, brand); // Call the constructor of the Car class
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding the accelerate method for ElectricCar
    @Override
    public void accelerate(int increment) {
        super.accelerate(increment);
        System.out.println("Electric Car Accelerating with Eco-friendly energy!");
    }

    // Additional method specific to ElectricCar
    public void chargeBattery() {
        System.out.println("Charging the battery...");
    }

    // Overriding the displayState method
    @Override
    public void displayState() {
        super.displayState();
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }
}

