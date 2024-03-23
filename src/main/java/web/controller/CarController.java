package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
        static List<Car> createCar() {
                List<Car> cars = new ArrayList<>();
                cars.add(new Car(1, "Gazm9s", 15));
                cars.add(new Car(12, "Gazm9s", 5));
                cars.add(new Car(1124, "Gazm9s", 157));
                cars.add(new Car(11, "Gazm9s", 1125));
                cars.add(new Car(51, "Gazm9s", 5));
                return cars;
        }

        @GetMapping(value = "/cars")
        public String countCar(@RequestParam(value = "count", required = false) Integer count , ModelMap model){
                if (count != null) {
                        List<Car> cars = CarController.createCar();
                        model.addAttribute("cars", CarService.countCar(cars,count));
                        return "cars";
                }else {
                        List<Car> cars = CarController.createCar();
                        model.addAttribute("cars", cars);
                        return "cars";
                }


        }
}
