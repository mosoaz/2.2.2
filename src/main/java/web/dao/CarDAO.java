package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAO {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Opel", "Astra", "Yellow"));
        cars.add(new Car("Kia", "Ceed", "Black"));
        cars.add(new Car("Nissan", "Juke", "Gray"));
        cars.add(new Car("Haval", "Jolion", "Blue"));
        cars.add(new Car("Chery", "Cruz", "White"));
    }

    public List<Car> getCars(int count) {
        return cars;
    }

}