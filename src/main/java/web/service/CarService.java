package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> getCarsList();
    public List<Car> getCountOfCars(Long count);


}
