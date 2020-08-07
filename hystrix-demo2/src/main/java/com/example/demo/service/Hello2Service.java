package com.example.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Hello2Service {

    @HystrixCommand(fallbackMethod="fallBack")
    public String sayHello2(){
        return new RestTemplate().getForObject("http://localhost:8081/hello1", String.class);
    }
    public String fallBack(){
        return "failure";
    }
    public String sayHello3(){
        return new RestTemplate().getForObject("http://localhost:8080/hello", String.class);
    }
}
