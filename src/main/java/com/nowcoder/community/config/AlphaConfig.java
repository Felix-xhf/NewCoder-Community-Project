package com.nowcoder.community.config;

/*
 * @description:配置类
 * @author: Felix_XHF
 * @create:2021-10-24 17:17
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AlphaConfig {

    @Bean //装配其他的bean,生成的结果以bean的形式装配到ioc容器中去
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
