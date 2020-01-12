package com.zb.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zb.admin.mapper")
public class ZbAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZbAdminApplication.class,args);
    }

}
