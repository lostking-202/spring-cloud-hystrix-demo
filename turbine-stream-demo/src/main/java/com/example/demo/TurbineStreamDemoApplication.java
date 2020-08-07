package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableTurbineStream
public class TurbineStreamDemoApplication {

	//turbine是一个聚合Hystrix监控数据的工具,单独使用没有任何意义
	//hystrix-dashboard需要被监控的服务开启@EnableHystrix @HystrixCommand注解的方法,可以不开启eureka,一定要开启actuator
	public static void main(String[] args) {
		SpringApplication.run(TurbineStreamDemoApplication.class, args);
	}

}
