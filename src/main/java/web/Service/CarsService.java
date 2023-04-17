package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;


public interface CarsService {


    public List<Car> getCarList(Integer q);

  //  public List<Car> getCars();
}
