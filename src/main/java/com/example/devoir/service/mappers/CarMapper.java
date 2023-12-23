package com.example.devoir.service.mappers;

import com.example.devoir.dao.entities.Car;
import com.example.devoir.service.dtos.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public CarDTO fromCarToCarDTO(Car car) {
        return this.modelMapper.map(car, CarDTO.class);
    }

    public Car fromCarDTOToCar(CarDTO carDTO) {
        return this.modelMapper.map(carDTO, Car.class);
    }
}