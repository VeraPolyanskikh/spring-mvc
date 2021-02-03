package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCarsLimited(int limit) {
        if(limit <0){
            limit = 0;
        }
       return carDao.getCarsLimited(limit);
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
}
