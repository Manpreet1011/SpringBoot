package com.manpreet.springDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
//import
@Data
//@AllArgsConstructor
public class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }
}

