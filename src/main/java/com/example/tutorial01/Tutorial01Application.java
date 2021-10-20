package com.example.tutorial01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tutorial01Application {

    public static void main(String[] args) {
        SpringApplication.run(Tutorial01Application.class, args);
    }

    @GetMapping("/hello")
    public String printDetails(@RequestParam(name = "aId") String accId,
                               @RequestParam(name = "bal", required = false,defaultValue = "10000") double balance){
        return "Account: " + accId + " has " + balance;
    }

}
