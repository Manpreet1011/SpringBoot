package com.manpreet.springDemo.config;

import com.manpreet.springDemo.domain.Car;
import com.manpreet.springDemo.domain.ElectricEngine;
import com.manpreet.springDemo.domain.PetrolEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.text.NumberFormat;
@PropertySource("classpath:car.properties")
public class ApppConfig {
    @Value("${car.make}")
    private String make;
    @Value("${car.model}")
    private String model;
    @Bean
    public ElectricEngine electricEngine(){
        return new ElectricEngine();
    }
    @Bean
    public PetrolEngine petrolEngine(){
        return new PetrolEngine();
    }
    @Bean
    public Car car(){
        return new Car(make,model,petrolEngine(), NumberFormat.getInstance());
    }
}
