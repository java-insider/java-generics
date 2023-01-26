package generics;

import generics.Vehicle.Bus;
import generics.Vehicle.Car;

import java.util.ArrayList;
import java.util.List;

public class App9 {

    public static void main(String[] args) {

        List<? extends Vehicle> l1 = new ArrayList<Vehicle>();
        List<? extends Vehicle> l2 = new ArrayList<Bus>();
        List<? extends Vehicle> l3 = new ArrayList<Car>();

        List<? super Bus> l4 = new ArrayList<Bus>();
        List<? super Bus> l5 = new ArrayList<Vehicle>();
        List<? super Bus> l6 = new ArrayList<Object>();

        l4.add(new Bus());
        var e = l4.get(0);
    }
}
