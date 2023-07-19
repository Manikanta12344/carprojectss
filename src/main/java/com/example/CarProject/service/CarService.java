package com.example.CarProject.service;

import com.example.CarProject.entity.Car;

import java.util.List;

public interface CarService
{

   public Car saveCar(Car car);

   public List<Car> carList();

   public void deleteCarById(Long carId);

   public Car updateCar(Long carId, Car car);
}
