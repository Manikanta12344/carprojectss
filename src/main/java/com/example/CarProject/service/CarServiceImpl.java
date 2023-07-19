package com.example.CarProject.service;

import com.example.CarProject.entity.Car;
import com.example.CarProject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class CarServiceImpl implements CarService
{
    @Autowired
    private CarRepository carRepository;


    @Override
    public Car saveCar(Car car)
    {
        return carRepository.save(car);
    }

    @Override
    public List<Car> carList()
    {
        return carRepository.findAll();
    }

    @Override
    public void deleteCarById(Long carId)
    {
        carRepository.deleteById(carId);
    }

    @Override
    public Car updateCar(Long carId, Car car)
    {
        Car cardb=carRepository.findById(carId).get();

        if(Objects.nonNull(car.getBrandName()) &&
                !"".equalsIgnoreCase(car.getBrandName()))
        {
            cardb.setBrandName(car.getBrandName());
        }

        if(Objects.nonNull(car.getCarModel()) &&
                !"".equalsIgnoreCase(car.getCarModel()))
        {
            cardb.setCarModel(car.getCarModel());
        }

        return carRepository.save(cardb);
    }
}