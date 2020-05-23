package com.xinyue.microcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Robert HG (254963746@qq.com) on 4/9/16.
 */
@SpringBootApplication

//开启对EurekaServer的支持，即：作为Eureka服务端
@EnableEurekaServer

//开启作为Eureka Server的客户端的支持
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args) {
       // SpringApplication.run(Application.class, args);
    	SpringApplication.run(Application.class, args);

    }

}
