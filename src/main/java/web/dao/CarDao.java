package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDao {
    private static int CARS_COUNT;

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "BMW", "z1", 2));
        cars.add(new Car(++CARS_COUNT, "Mers", "z2", 4));
        cars.add(new Car(++CARS_COUNT, "Kia", "z3", 2));
        cars.add(new Car(++CARS_COUNT, "Honda", "z4", 4));
        cars.add(new Car(++CARS_COUNT, "Ford", "z5", 2));
    }

    public List<Car> getCars(int a) {
        if (a >= 5) {
            return cars.toArray();
        } else
            return cars.subList(0, a);
        }
    }