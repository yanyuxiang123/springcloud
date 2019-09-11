package com.example.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class EurekaClientApplication {

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "Hello world";
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
