package com.example.CarProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CarModels
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  modelId;

    private String modelName;
    private String modelType;
    private String modelWarranty;
    private String modelYear;
}
