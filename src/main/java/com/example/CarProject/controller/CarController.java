package com.example.CarProject.controller;

import com.example.CarProject.entity.Car;
import com.example.CarProject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController
{
    @Autowired
    private CarService carService;

    @PostMapping("/car")
    public Car saveCar(@RequestBody Car car)
    {
        return carService.saveCar(car);
    }

    @GetMapping("/car")
    public List<Car> carList()
    {
        return carService.carList();
    }

    @DeleteMapping("/car/{id}")
    public String deleteCarById(@PathVariable("id") Long carId)
    {
        carService.deleteCarById(carId);
        return "deleted";
    }


    @PutMapping("/car/{id}")
    public Car updateCar(@PathVariable("id") Long carId,@RequestBody Car car)
    {
        return carService.updateCar(carId,car);

    }


}
