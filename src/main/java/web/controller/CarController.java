package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    public CarService carService;

    @GetMapping(value = "/cars")
    public String getLimitedCars(
                                 @RequestParam(required = false) Integer count,
                                 ModelMap model) {

        List<Car> cars;
        if(count == null ){
            cars = carService.getAllCars();
        }else {
            cars = carService.getCarsLimited(count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
