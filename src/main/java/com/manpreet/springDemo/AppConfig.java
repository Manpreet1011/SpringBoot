package com.manpreet.springDemo;

import com.manpreet.springDemo.domain.Car;
import com.manpreet.springDemo.domain.ElectricEngine;
import com.manpreet.springDemo.domain.PetrolEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.text.NumberFormat;

@PropertySource("Classpath: car.properties")
public class AppConfig {
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
        return new Car("Honda","Civic",petrolEngine(),NumberFormat.getInstance());
   //     return new Car(make,model,petrolEngine(),NumberFormatProvider);
    }
}
