package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> countCar(List<Car> cars, int count);
    List<Car> createCar();

}
