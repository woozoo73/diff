package com.example.diff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class DiffApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DiffApplication.class, args);
        System.out.println(Arrays.toString(context.getBeanNamesForType(Environment.class)));
    }

}
