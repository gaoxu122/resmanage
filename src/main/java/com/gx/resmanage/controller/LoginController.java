package com.gx.resmanage.controller;

import com.gx.resmanage.biz.LoginBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author gaoxu
 * @date 2019-09-11 14:53
 */

@Controller
@RequestMapping("/user")
public class LoginController {


    @Autowired
    LoginBiz loginBiz;

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        Map<String, Object> map) {


        Boolean login = loginBiz.login(userName, password);

        if (login) {
            // 登陆成功之后  重定向
            return "redirect:/main.html";
        } else {
            // 登陆失败之后
            map.put("msg", "用户名或密码输入不正确");
            return "login";
        }

    }

    /**
     * 用户退出
     */

    public void loginOut() {

    }
}
