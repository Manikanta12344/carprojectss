package com.example.CarProject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long carId;

    private String brandName;
    private String carModel;

    @OneToMany(targetEntity =CarModels.class,cascade = CascadeType.ALL)
    @JoinColumn(
            name = "carModel_id",
            referencedColumnName ="carId")

    private List<CarModels> carModels;


}
