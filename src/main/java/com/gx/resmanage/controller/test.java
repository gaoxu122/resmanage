package com.gx.resmanage.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoxu
 * @date 2019-09-03 11:05
 */

@RestController
@RequestMapping("/test")
public class test {

    private String name;

    @GetMapping("/wang")
    public String userName() {
        return "wang" + name;
    }

}
