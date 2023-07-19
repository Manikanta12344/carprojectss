package com.example.CarProject.controller;

import com.example.CarProject.dto.AllModels;
import com.example.CarProject.entity.Car;
import com.example.CarProject.entity.CarModels;
import com.example.CarProject.repository.CarModelsRepository;
import com.example.CarProject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetAllController
{
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarModelsRepository carModelsRepository;

//    @PostMapping("/getall")
//    public Car placeOrder(@RequestBody AllModels allModels)
//    {
//        return carRepository.save(allModels.getCar());
//    }



    @GetMapping("/getalllist")
    public List<Car> getalllist()
    {
        return carRepository.findAll();
    }


    @GetMapping("/carmodels/name/{name}")
    public CarModels fetchModels(@PathVariable("name") String modelName)
    {
        return carModelsRepository.findByModelNameIgnoreCase(modelName);
    }

}
