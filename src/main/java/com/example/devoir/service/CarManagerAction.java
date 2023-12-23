package com.example.devoir.service;

import com.example.devoir.dao.repositories.CarRepository;
import com.example.devoir.service.dtos.CarDTO;
import com.example.devoir.service.mappers.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarManagerAction implements CarManager{
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarMapper carMapper;


    public CarDTO getCarById(Long id) {
        return carMapper.fromCarToCarDTO(carRepository.findById(id).get());
    }


    public CarDTO saveCar(CarDTO carDTO) {
        return carMapper.fromCarToCarDTO(carRepository.save(carMapper.fromCarDTOToCar(carDTO)));

    }
    public CarDTO deleteCar(Long id) {
        CarDTO deletedCarDTO = getCarById(id);
        carRepository.deleteById(id);
        return deletedCarDTO;
    }
}
