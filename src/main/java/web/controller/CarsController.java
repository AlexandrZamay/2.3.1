package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;
import web.Model.Car;
import web.Service.CarsService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {
    private final CarsDAO carsDAO;

    public CarsController(CarsDAO carsDAO) {
            this.carsDAO = carsDAO;
    }

    @GetMapping()
    public String printCars(ModelMap model){
        List<Car> carList = carsDAO.getCars();
        model.addAttribute("carsList", carList);
        return "cars";
    }
    @GetMapping("/carlist")
    public String printCars(ModelMap model, @RequestParam(value = "number", required = false) Integer numbers) {
        int quantity = numbers;
        List<Car> carList = carsDAO.getCarList(quantity);
        model.addAttribute("carList", carList);
        return "cars";
    }

}

