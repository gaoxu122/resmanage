package com.gx.resmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class ResmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResmanageApplication.class, args);
    }

    @Bean   // 很重要
    public ViewResolver myViewResolver() {

        return new myViewResolver();
    }


    private static class myViewResolver implements ViewResolver {

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }



}
