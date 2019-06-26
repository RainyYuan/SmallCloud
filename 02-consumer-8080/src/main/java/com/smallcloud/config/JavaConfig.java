package com.smallcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: YuanGuiyu
 * @Date: 2019/6/26/026 9:11
 * @Version 1.0
 */
@Configuration
public class JavaConfig {


    @LoadBalanced  //开启消费者客户端的负载均衡功能
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
