package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
/*     static List<Car> countCar(List<Car> cars, int count) {
        if (count > cars.size()){
            count = cars.size();
        }
        List<Car> cars2 = new ArrayList<>();
        for (int k = 0 ; k<count ; k++){
            cars2.add(cars.get(k));
        }
        return cars2;
    }*/
    List<Car> countCar(List<Car> cars, int count);
    List<Car> createCar();

}
