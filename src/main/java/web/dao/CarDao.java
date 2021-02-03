package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getCarsLimited(int limit);

    List<Car> getAllCars();
}
