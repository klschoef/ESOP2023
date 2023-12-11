package classes;

public class TestCars {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Red", "Toyota");
        // Using methods of the Car class
        myCar.accelerate(50); // Accelerates the car to 50 km/h
        myCar.displayState(); // Displays the state of the car
        myCar.brake(); // Applies brakes
        myCar.displayState(); // Displays the state of the car


        System.out.println();
        ElectricCar myElectricCar = new ElectricCar("Blue", "Tesla", 75);
        myElectricCar.accelerate(60);
        myElectricCar.displayState();
        myElectricCar.chargeBattery();
        myElectricCar.brake();
        myElectricCar.displayState();
    }

}
