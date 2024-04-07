package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String carsPage(@RequestParam(value = "count", defaultValue = "5", required = false)
                               Integer count, ModelMap model) {

        model.addAttribute("cars", new CarService().addCars(count));
        return "cars";
    }
}