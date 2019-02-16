package com.lmm.springclound.cfgbeans;

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
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
