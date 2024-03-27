package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> countCar(List<Car> cars, int count) {
        if (count > cars.size()) {
            count = cars.size();
        }
        List<Car> cars2 = new ArrayList<>();
        for (int k = 0; k < count; k++) {
            cars2.add(cars.get(k));
        }
        return cars2;
    }

    @Override
    public List<Car> createCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Gazm9s", 15));
        cars.add(new Car(12, "Gazm9s", 5));
        cars.add(new Car(1124, "Gazm9s", 157));
        cars.add(new Car(11, "Gazm9s", 1125));
        cars.add(new Car(51, "Gazm9s", 5));
        return cars;
    }
}
