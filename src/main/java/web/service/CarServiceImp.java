package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {


    public List<Car> getAllCars() {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "X5", 2018));
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Audi", "A4", 2019));
        cars.add(new Car("Mercedes", "C200", 2021));
        cars.add(new Car("Honda", "Accord", 2017));
        return cars;
    }


    public List<Car> getCars(Integer count) {
        List<Car> allCars = getAllCars();
        if (count == null || count >= 5) {
            return allCars;
        } else {
            return allCars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
