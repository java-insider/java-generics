package generics;

import generics.Vehicle.Bus;
import generics.Vehicle.Car;

import java.util.ArrayList;
import java.util.List;

public class App5 {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bus);
        vehicles.add(car);

        driveVehicles(vehicles);

//        List<Car> cars = new ArrayList<>();
//        cars.add(car);
//
//        driveVehicles(cars);
    }

    private static void driveVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            v.drive();
        }
    }
}
