package com.example.springeventbus;

import com.example.springeventbus.service.PayService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringEventBusApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringEventBusApplication.class, args);
        PayService payService = run.getBean(PayService.class);
        payService.pay();
    }

}
