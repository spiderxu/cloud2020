package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: xuzhi
 * @date: 2020/10/28 12:38
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * RestTemplate用于服务于服务之间的通信
     * @return
     */
    @Bean
    @LoadBalanced  //为RestTemplate添加默认负载均衡机制
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
