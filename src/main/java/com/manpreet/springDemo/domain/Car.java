package com.manpreet.springDemo.domain;

import lombok.Data;
import lombok.ToString;

import java.text.NumberFormat;

//import
@Data
@ToString
//@AllArgsConstructor
public class Car {
    private String make;
    private String model;
    private Engine engine;
    private final NumberFormat format;

    public Car(String make, String model, Engine engine,NumberFormat format) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.format=format;
    }
}

