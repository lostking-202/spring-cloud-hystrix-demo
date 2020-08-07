# spring-cloud-hystrix-demo
hystrix组件

turbine是一个聚合Hystrix监控数据的工具,单独使用没有任何意义
---
hystrix-dashboard开启的最小配置
需要一个server监听其他client,可以不开启eureka
---
hystrix-dashboard需要被监控的服务开启@EnableHystrix @HystrixCommand注解的方法,可以不开启eureka,一定要开启actuator
---
集成turbine
--需要开启eureka,被监听的服务也要注册到eureka上
不用导入eureka_client和使用@EnableEurekaClient注解都会自动注册上
---
注意: hystrix-dashboard的url是需要被注册的服务的
turbine的url是需要开启注册的服务的url,也就是加了@EnableTurbine的服务
---
turbine使用rabbitmq收集数据(因为遇到版本兼容问题所以换了一个spring boot和spring cloud的版本)

