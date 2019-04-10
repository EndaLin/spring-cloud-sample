# # Spring Cloud 创建服务消费者（feign）
Feign 是一个声明式的伪 Http 客户端，它使得写 Http 客户端变得更简单。使用 Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，可使用 Feign 注解和 JAX-RS 注解。Feign 支持可插拔的编码器和解码器。Feign 默认集成了 Ribbon，并和 Eureka 结合，默认实现了负载均衡的效果

- Feign 采用的是基于接口的注解
- Feign 整合了 ribbon
- Feign 自带熔断器