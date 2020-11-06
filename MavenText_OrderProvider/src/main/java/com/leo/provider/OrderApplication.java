package com.leo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.mybatis.spring.annotation.MapperScan;

/**
 * projectName: ManevTest
 *
 * @author: 徐林旗
 * time:2020/11/5 22:40
 * desription:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.leo.provider.dao")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}