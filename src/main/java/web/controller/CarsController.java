package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
//    @ResponseBody
    public String getCars(ModelMap model, @RequestParam(required = false) Integer count) {

        List<Car> myCars = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            myCars.add(new Car("model " + i, 200, 2000 + i));
        }
        if (count == null || count >= 5) {
            model.addAttribute("myCars", myCars);
        } else {
            List<Car> newCars = carService.listCars(myCars, count);
            model.addAttribute("myCars", newCars);
        }
        return "cars";
    }
}
