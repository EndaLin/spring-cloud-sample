# Spring Cloud 创建服务消费者（Ribbon）

Ribbon 是一个负载均衡客户端，可以很好的控制 http 和 tcp 的一些行为


### 熔断器 Hystrix 组件
- 在微服务架构中，根据业务来拆分成一个个的服务，服务与服务之间可以通过 RPC 相互调用，在 Spring Cloud 中可以用 RestTemplate + Ribbon 和 Feign 来调用。为了保证其高可用，单个服务通常会集群部署。由于网络原因或者自身的原因，服务并不能保证 100% 可用，如果单个服务出现问题，调用这个服务就会出现线程阻塞，此时若有大量的请求涌入，Servlet 容器的线程资源会被消耗完毕，导致服务瘫痪。服务与服务之间的依赖性，故障会传播，会对整个微服务系统造成灾难性的严重后果，这就是服务故障的 “雪崩” 效应。
- 较底层的服务如果出现故障，会导致连锁故障。当对特定的服务的调用的不可用达到一个阀值（Hystrix 是 5 秒 20 次） 熔断器将会被打开。

[熔断器监控http://localhost:8764/hystrix](http://localhost:8764/hystrix)

[参考李卫民老师的博客](http://blog.funtl.com:8080/2018/05/29/microservice/Spring-Cloud-%E4%BD%BF%E7%94%A8%E7%86%94%E6%96%AD%E5%99%A8%E4%BB%AA%E8%A1%A8%E7%9B%98%E7%9B%91%E6%8E%A7/)