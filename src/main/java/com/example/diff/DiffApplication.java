package com.example.diff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class DiffApplication {

//    @Autowired
//    private Environment environment;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DiffApplication.class, args);
        System.out.println(Arrays.toString(context.getBeanNamesForType(Environment.class)));
    }

//    @Bean
//    public Environment environment() {
//        return environment;
//    }

}
