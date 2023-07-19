package com.example.CarProject.repository;

import com.example.CarProject.entity.CarModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarModelsRepository extends JpaRepository<CarModels,Long>
{

    public CarModels findByModelNameIgnoreCase(String modelName);
}
