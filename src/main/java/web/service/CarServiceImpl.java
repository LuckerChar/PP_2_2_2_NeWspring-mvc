package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private static int CARS_COUNT;
    private List<Car> cars = new ArrayList<>();
    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "BMW", "z1", 2));
        cars.add(new Car(++CARS_COUNT, "Mers", "z2", 4));
        cars.add(new Car(++CARS_COUNT, "Kia", "z3", 2));
        cars.add(new Car(++CARS_COUNT, "Honda", "z4", 4));
        cars.add(new Car(++CARS_COUNT, "Ford", "z5", 2));
    }
    @Override
    public List<Car> getCars(int count) {
        return count < 5 ? cars.stream().limit(count).toList() : cars;
    }
}
