package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarsService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping(value = "/cars")
public class CarsController {
    public static CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/carlist")
    public String printCars(ModelMap model, @RequestParam(value = "number", required = false) int number) {
      //  int quantity = number;
        List<Car> carList = carsService.getCarList();
        model.addAttribute("carList", carList);
        return "cars";
    }

}

