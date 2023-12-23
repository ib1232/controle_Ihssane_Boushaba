package com.example.devoir;

import com.example.devoir.dao.entities.Car;
import com.example.devoir.dao.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DevoirApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoirApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CarRepository carRepository) {
        return args -> {

            List<Car> carList = List.of(
                    Car.builder().model("eey").color("rouge").matricul("R455").price("8118").build(),
                    Car.builder().model("tttr").color("vert").matricul("Y564").price("9999").build(),
                    Car.builder().model("aaa").color("blanc").matricul("E5555").price("77777").build(),
                    Car.builder().model("sss").color("noir").matricul("O5115").price("2242").build()

                    );
            carRepository.saveAll(carList);
        };
    }
}
