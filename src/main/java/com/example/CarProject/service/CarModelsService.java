package com.example.CarProject.service;

import com.example.CarProject.entity.CarModels;

import java.util.List;

public interface CarModelsService 
{

    public CarModels saveCar(CarModels carModels);

   public List<CarModels> carModelsList();

    public void deleteCarModelsById(Long modelId);
}
