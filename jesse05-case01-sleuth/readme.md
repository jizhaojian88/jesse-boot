## 项目简介

本文案例一共四个工程采用多Module形式。需要新建一个主Maven工程，
主要指定了Spring Boot的版本为1.5.3，Spring Cloud版本为Dalston.RELEASE。
包含了eureka-server工程，作为服务注册中心，eureka-server的创建过程这里不重复；
zipkin-server作为链路追踪服务中心，负责存储链路数据；
gateway-service作为服务网关工程，负责请求的转发,同时它也作为链路追踪客户端，负责产生数据，
并上传给zipkin-service；user-service为一个应用服务，对外暴露API接口，同时它也作为链路追踪客户端，负责产生数据。

## 主要步骤
完整的项目搭建完毕，
依次启动eureka-server、zipkin-server、user-service、gateway-service。
在浏览器上访问http://localhost:5000/user-api/user/hi，浏览器显示：


zipkin-server，端口为9411，服务注册地址为http://localhost:8761
http://localhost:9411/info

user-service，端口为8762，服务注册地址为http://localhost:8761/eureka/，
Zipkin Server地址为http://localhost:9411

gateway-service，端口为5000，服务注册地址为http://localhost:8761/eureka/，Zipkin Server地址为http://localhost:9411


http://localhost:8761
http://localhost:9411/info
http://localhost:8762/user/hi

http://localhost:5000/user-api/user/hi
http://localhost:9411
。

