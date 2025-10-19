package com.wj.spiritmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/*
*   想要远程调用别的服务
*  1）引入open-feign
*  2）编写一个接口，告诉SpringCloud中国接口需要调用远程服务
*    1、声明接口的每一个方法都是调用哪个远程服务的那个请求
*    2、开启远程调用功能
* */
@EnableFeignClients(basePackages = "com.wj.spiritmall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class SpiritmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiritmallMemberApplication.class, args);
    }

}
