package com.clean_architecture_utils.spring;

import com.clean_architecture_utils.config.StoicServiceBeanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        StoicServiceBeanConfig.getStoicMessagesService().getMessagesFromService()
                .forEach(elem -> System.out.println(elem));

        SpringApplication.run(Main.class, args);
    }
}