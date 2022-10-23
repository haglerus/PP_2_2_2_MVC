package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

//    @GetMapping(value = "/cars")
//    public String getCars(ModelMap model) {
//        model.addAttribute("cars", carService.getCarsList());
//        return "cars";
//    }

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam( value = "count", defaultValue = "8342432432") Long count) {

        model.addAttribute("cars", carService.getCountOfCars(count));
        return "cars";
    }
}
