package com.perscholas.one_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.perscholas")
public class OneRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneRestApplication.class, args);
    }

}
