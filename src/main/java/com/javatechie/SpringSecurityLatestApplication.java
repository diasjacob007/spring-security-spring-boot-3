package com.javatechie;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatechie.dto.Product;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringSecurityLatestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityLatestApplication.class, args);
    }

}
