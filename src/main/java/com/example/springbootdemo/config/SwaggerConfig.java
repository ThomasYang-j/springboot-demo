package com.example.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//https://blog.csdn.net/lsqingfeng/article/details/123678701
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30) // v2 不同
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yunjia.bigscreennb.nb.controller")) // 设置扫描路径
                .build();
    }
}