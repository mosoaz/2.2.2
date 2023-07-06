package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final CarDAO carDao;

    @Autowired
    public CarService(CarDAO carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCars(int count) {
        return carDao.getCars().stream().limit(count).collect(Collectors.toList());
    }
}