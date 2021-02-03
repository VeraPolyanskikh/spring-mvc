package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private List<Car> allCars;

    public CarDaoImpl() {
        initData();
    }

    private void initData() {
        allCars = new ArrayList<>();
        allCars.add(new Car("Porsche", 3, "Tom Hardy"));
        allCars.add(new Car("Mercedes", 2, "Colin Farell"));
        allCars.add(new Car("Audi", 3, "Christina Aguilera"));
        allCars.add(new Car("Mazda", 6, "User1"));
        allCars.add(new Car("Lancer", 55, "User2"));
    }

    @Override
    public List<Car> getCarsLimited(int limit) {
        return allCars.stream().limit(limit).collect(Collectors.toList());
    }

    @Override
    public List<Car> getAllCars() {
        return allCars;
    }
}
