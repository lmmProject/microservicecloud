package com.lmm.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: mmli3
 * @Date: Created in 2019/2/16
 * @Description: 自定义轮询算法
 */
@Configuration
public class MySelfRule  {

    @Bean
    public IRule myRule(){
        // 达到的目的，用我们重新选择的随机算法替代默认的轮询
        return new RandomRule_ZY();
    }

}
