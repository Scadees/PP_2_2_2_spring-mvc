package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService implements CarServiceImpl {

    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> addCars(int count) {
        cars.add(new Car("Nissan", 2024, 0));
        cars.add(new Car("Audi", 2015, 2500));
        cars.add(new Car("Honda", 2000, 10000));
        cars.add(new Car("Volvo", 2020, 1000));
        cars.add(new Car("Ferrari", 2022, 400));

        if (count == 0 || count >= cars.size()) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }

}
