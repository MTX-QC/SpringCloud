package com.mtx.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CoursePriceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoursePriceApplication.class,args);
    }
}