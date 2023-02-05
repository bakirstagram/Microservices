package com.spring.mciro.demo.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

    /*
     * При указании аннотаций @EnableDiscoveryClient тоже отработает,
     *  т.к. Eureka является Discovery сервисом, но вот в
     * случае если использовать любой другой Dicovery сервис и
     * использовать аннотацию @EnableEurekaClient, так уже не прокатит*/
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
