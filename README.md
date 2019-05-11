# spring-cloud-sample
![示意图](images/ZuuI.png)

解释： 在 Spring Cloud 微服务系统中，一种常见的负载均衡方式是，客户端的请求首先经过负载均衡（Zuul、Ngnix），再到达服务网关（Zuul 集群），然后再到具体的服。服务统一注册到高可用的服务注册中心集群，服务的所有的配置文件由配置服务管理，配置服务的配置文件放在 GIT 仓库，方便开发人员随时改配置。
#### 技术要点
- Maven
- Spring Boot
- Eureka 服务注册中心
- Ribbon 服务消费者
- Feign 服务消费者
- Hystrix 熔断器
- Hystrix 熔断器仪盘表监控
- Zuul API网关
- 分布式配置中心
- Zipkin 链路追踪
- 服务监控

#### 部分运行截图
- 服务开启  
![server](images/service.png)  
![eureka](images/eureka.png)  

- 熔断器仪盘表  
![dashboard](images/hystrix_dashboard.PNG)
![args](http://blog.funtl.com:8080/assets/20171123110838020.png)

- Zipkin 链路追踪
![链路追踪](images/zipkin.png)

- 监控
![监控](images/admin.PNG)

#### 推荐李卫民老师的教学视频
地址：[李卫民老师的个人博客](https://www.funtl.com)


#### 服务启动顺序
- 服务注册与发现
- 分布式配置中心
- 服务监控
- 服务提供者
- 服务消费者
- API 网关


#### 待解决的问题
- 暂无
