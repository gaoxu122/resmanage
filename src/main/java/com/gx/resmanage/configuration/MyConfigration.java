package com.gx.resmanage.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author gaoxu
 * @date 2019-09-09 16:22
 */


@Configuration
public class MyConfigration implements WebMvcConfigurer {

    // 按住ctrl +o  调出所有的重写方法

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        // 表示浏览器发送user请求，直接展示success界面
        registry.addViewController("user").setViewName("success");
        registry.addViewController("login").setViewName("success");
        registry.addViewController("/").setViewName("login");
    }
}
