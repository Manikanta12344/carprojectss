package com.example.CarProject.controller;

import com.example.CarProject.entity.Car;
import com.example.CarProject.entity.CarModels;
import com.example.CarProject.service.CarModelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarModelsController
{
    @Autowired
    private CarModelsService carModelsService;


    @PostMapping("/carModels")
    public CarModels saveCar(@RequestBody CarModels carModels)
    {
        return carModelsService.saveCar(carModels);
    }

    @GetMapping("/carModels")
    public List<CarModels> carModelsList()
    {
        return carModelsService.carModelsList();
    }


    @DeleteMapping("/carModels/{id}")
    public String deleteCarModelsById(@PathVariable("id") Long modelId)
    {
        carModelsService.deleteCarModelsById(modelId);
        return "deleted carModels";
    }
}

