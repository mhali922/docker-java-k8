package com.mt.springmongo;;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class DemoApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World - in Docker Container";
    }

 }
