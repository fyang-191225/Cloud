package com.fyy.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fyy
 * @date 2019/12/26 0026 下午 15:46
 */

@SpringBootApplication
@EnableEurekaServer// 启用注册中心， 标记这是一个注册中心
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }
}
