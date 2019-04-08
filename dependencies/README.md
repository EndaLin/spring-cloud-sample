#### 技术要点

- parent：继承了 Spring Boot 的 Parent，表示我们是一个 Spring Boot 工程
- package：pom，表示该项目仅当做依赖项目，没有具体的实现代码
- spring-cloud-dependencies：在 properties 配置中预定义了版本号为 Finchley.RC1 ，表示我们的 Spring Cloud 使用的是 F 版
- build：配置了项目所需的各种插件
- repositories：配置项目下载依赖时的第三方库