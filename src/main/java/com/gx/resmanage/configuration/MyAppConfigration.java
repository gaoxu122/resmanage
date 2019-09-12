package com.gx.resmanage.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

/**
 * 配置类
 *
 * @author gaoxu
 * @date 2019-09-04 17:45
 */


@Configuration
public class MyAppConfigration {

    // 将方法的返回值添加到容器中
    @Bean
    public HelloSerivice helloSerivice() {

        return null;
    }



}
