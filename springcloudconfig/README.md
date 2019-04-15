# Spring Cloud Config

配置服务器的默认端口为8888, 如果修改默认端口, 则客户端项目则不能在application文件中配置spring.cloud.config.uri,必须在bootstrap中配置, 因为bootstrap开头的配置文件会被优先加载和配置