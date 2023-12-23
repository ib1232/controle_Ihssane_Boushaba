package com.example.devoir.web;

import com.example.devoir.service.CarManager;
import com.example.devoir.service.dtos.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CarGraphQLController {
    @Autowired
    private CarManager carManager;
    @QueryMapping
    public CarDTO getCarById(@Argument Long id) {
        return carManager.getCarById(id);
    }
@MutationMapping
public CarDTO saveCar (CarDTO carDTO) {
        return carManager.saveCar(carDTO);
}
    @MutationMapping
    public CarDTO deleteCar(@Argument Long id) {
        return carManager.deleteById(id;
    }


    }
