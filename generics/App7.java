package generics;

import generics.Vehicle.Bus;
import generics.Vehicle.Car;

import java.util.ArrayList;
import java.util.List;

public class App7 {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(bus);
        vehicles.add(car);

        List<? extends Vehicle> cars = new ArrayList<Car>();
        //cars.add(car); --> Não pode adicionar!
    }
}
