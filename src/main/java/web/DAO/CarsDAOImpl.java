package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarsDAOImpl implements CarsDAO {
    List<Car> cars;
    {
            cars = new ArrayList<>();

            cars.add(new Car(80, true, "green"));
            cars.add(new Car(240, false, "white"));
            cars.add(new Car(148, false, "black"));
            cars.add(new Car(1337, false, "spaceGray"));
            cars.add(new Car(150, true, "red"));



    }
    public List<Car> getCarList(Integer q) {
        return cars.subList(0, q);
    }



    public int getListSize(){
        return cars.size();
    }
   // public List<Car> getCars() {
    //   return cars;
   // }
}
