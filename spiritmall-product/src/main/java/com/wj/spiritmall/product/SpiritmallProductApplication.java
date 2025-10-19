package com.wj.spiritmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/*
* 1、整合Mybatis-Plus
*  1) 导入依赖
*  2) 配置
*       1、配置数据源：
*           1)、导入数据库的驱动
*           2)、在application.yml配置数据源相关信息
*       2、配置Mybatis-plus:
*          1)、使用MapperScan
*          2)、告诉Mybatis-plus,sql映射文件在哪
* 2、逻辑删除
*  1）、配置全局的逻辑删除规则（省略）
*  2）、如不想使用全局配置，可以在实体类中使用 @TableLogic 注解，对类单独进行配置
* */
@EnableDiscoveryClient
@MapperScan("com.wj.spiritmall.product.dao")
@SpringBootApplication
public class SpiritmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiritmallProductApplication.class, args);
    }

}
