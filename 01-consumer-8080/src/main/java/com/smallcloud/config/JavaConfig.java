package com.smallcloud.config;

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


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
