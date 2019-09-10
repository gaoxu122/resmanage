package com.gx.resmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * @author gaoxu
 * @date 2019-09-09 11:10
 */

@Controller
public class WebTest {

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {

        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("张三", "李四", "王五"));
        return "success";
    }
}
