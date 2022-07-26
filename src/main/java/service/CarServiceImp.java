package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Override
    public List<Car> listCars(List<Car> cars, int count) {
        List<Car> newCars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            newCars.add(cars.get(i));
        }
        if (count >= 5) {
            return cars;
        }
        return newCars;
    }
}
