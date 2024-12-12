package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}

@RestController
class HelloWorldController {

    private final AtomicInteger visitCount = new AtomicInteger(0);

    @GetMapping("/")
    public String sayHello() {
        int count = visitCount.incrementAndGet();
        return "Hello World " + count;
    }
}
