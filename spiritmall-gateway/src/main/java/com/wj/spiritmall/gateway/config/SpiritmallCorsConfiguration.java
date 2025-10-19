package com.wj.spiritmall.gateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;

@Configuration
public class SpiritmallCorsConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfig = new CorsConfiguration();

        // 允许所有来源（生产环境应替换为具体域名）
        corsConfig.addAllowedOriginPattern("*");

        // 允许所有请求头
        corsConfig.addAllowedHeader("*");

        // 允许所有方法（GET, POST, PUT, DELETE, OPTIONS 等）
        corsConfig.addAllowedMethod("*");

        // 允许携带凭证（如 cookies）
        corsConfig.setAllowCredentials(true);

        // 预检请求缓存时间（秒）
        corsConfig.setMaxAge(3600L);

        // 对所有路径生效
        source.registerCorsConfiguration("/**", corsConfig);

        return new CorsWebFilter(source);
    }
}
