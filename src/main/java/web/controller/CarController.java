package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping("/cars")
    public String carsPage(@RequestParam(value = "count", defaultValue = "5", required = false)
                               Integer count, ModelMap model) {

        model.addAttribute("cars", carService.getCarsByCount(count));
        return "cars";
    }
}
