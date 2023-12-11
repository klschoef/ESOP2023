package classes;

public class TestCars {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar1 = new Car("Red", "BMW");
        // Using methods of the Car class
        myCar1.accelerate(50); // Accelerates the car to 50 km/h
        myCar1.displayState(); // Displays the state of the car
        myCar1.brake(); // Applies brakes
        myCar1.displayState(); // Displays the state of the car

        Car myCar2 = new Car("Silver", "Audi");
        myCar2.accelerate(100);
        myCar2.displayState();

        System.out.println();
        ElectricCar myElectricCar = new ElectricCar("Blue", "Tesla", 75);
        myElectricCar.accelerate(60);
        myElectricCar.displayState();
        myElectricCar.chargeBattery();
        myElectricCar.brake();
        myElectricCar.displayState();

        Car myElectricCar1 = myElectricCar; //"polymorphism"
        myElectricCar1.displayState(); //dynamic typing

        //we could store all object with the Car type
        Car[] car = new Car[3];
        car[0] = myCar1;
        car[1] = myCar2;
        car[2] = myElectricCar1;

        Object o = myElectricCar1;
        ElectricCar e = (ElectricCar) o;
    }

}
