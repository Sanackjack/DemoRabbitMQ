package com.example.nackrabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableRabbit
@SpringBootApplication
public class NackRabbitMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(NackRabbitMqApplication.class, args);
    }

}
