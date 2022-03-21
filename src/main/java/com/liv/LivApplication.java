package com.liv;

import com.liv.entity.Car;
import com.liv.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class LivApplication {
    @Autowired
    CarRepository carRepository;

    public static void main(String[] args) {
        SpringApplication.run(LivApplication.class, args);
    }

    @PostConstruct
    public void dataInit() {
        Car car1 = new Car("BMW", "M5");
        Car car2 = new Car("Kia", "soreno");
        Car car3 = new Car("Mersedes", "s5");

//        carRepository.save(car1);
//        carRepository.save(car2);
//        carRepository.save(car3);
        carRepository.saveAll(new ArrayList<Car>(Arrays.asList(car1,car2,car3)));
    }
}
