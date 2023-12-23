package com.example.devoir.service.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class CarDTO {
    private String model;
    private String color;
    private String price;
}
