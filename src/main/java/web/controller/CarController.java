package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {
    private CarServiceImpl carService;

    @Autowired
    public void setCarService(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String countCar(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count != null) {
            List<Car> cars = carService.createCar();
            model.addAttribute("cars", carService.countCar(cars, count));
            return "cars";
        } else {
            List<Car> cars = carService.createCar();
            model.addAttribute("cars", cars);
            return "cars";
        }


    }
}

