package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarService carService;
    private List<Car> cars = new ArrayList<>();

    public CarServiceImp() {
        cars.add(new Car("Volvo", "XC90", "Ivanov"));
        cars.add(new Car("BMW", "X5", "Petrov"));
        cars.add(new Car("Subaru", "Impreza99", "Sergeev"));
        cars.add(new Car("Mercedes", "C300", "Volodin"));
        cars.add(new Car("Haval", "F9", "Aleksandrov"));
        cars.add(new Car("Opel", "100", "Karaseva"));
    }

    @Override
    public List<Car> getCarsList() {
        return cars;
    }

    @Override
    public List<Car> getCountOfCars(Long count) {
        List<Car> cars = carService.getCarsList();
        return count < 5 ? cars.stream().limit(count).toList() : cars;
    }
}
