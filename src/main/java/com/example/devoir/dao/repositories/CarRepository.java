package com.example.devoir.dao.repositories;

import com.example.devoir.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
