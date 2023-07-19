package com.example.CarProject.service;

import com.example.CarProject.entity.CarModels;
import com.example.CarProject.repository.CarModelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelsImpl implements CarModelsService
{
    @Autowired
    private CarModelsRepository carModelsRepository;

    @Override
    public CarModels saveCar(CarModels carModels)
    {
        return carModelsRepository.save(carModels);
    }

    @Override
    public List<CarModels> carModelsList() {
        return carModelsRepository.findAll();
    }

    @Override
    public void deleteCarModelsById(Long modelId)
    {
        carModelsRepository.deleteById(modelId);

    }
}
