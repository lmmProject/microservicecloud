package com.lmm.springclound.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: mmli3
 * @Date: Created in 2019/2/16
 * @Description: 加了@Configuration等同于applicationContext.xml
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced // Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡 的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
