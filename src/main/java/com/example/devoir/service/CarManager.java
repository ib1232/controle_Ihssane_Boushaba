package com.example.devoir.service;

import com.example.devoir.service.dtos.CarDTO;

import org.springframework.stereotype.Component;

@Component
public interface CarManager {
    public CarDTO getCarById(Long id);
    public CarDTO saveCar(CarDTO carDTO);
    public CarDTO deleteCar (CarDTO carDTO);

}
