package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zb.user.mapper")
public class ZbUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZbUserApplication.class, args);
    }
}
