package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;
import web.DAO.CarsDAOImpl;
import web.Model.Car;
import web.Service.CarsService;

import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {
    private CarsDAO carsDAO;
    private CarsService carsService;
    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

//    @GetMapping()
//    public String printCars(Model model){
//        List<Car> carList = carsService.getCars();
//        model.addAttribute("carsList", carList);
//        return "cars";
//    }
    @GetMapping()
    public String printCars(Model model, @RequestParam(value = "count", required = false) Integer numbers) {

        model.addAttribute("carList", carsService.getCarList(numbers));
        return "cars";
    }

}

