package com.gx.resmanage.biz;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import sun.security.util.Password;

/**
 * @author gaoxu
 * @date 2019-09-11 14:56
 */

@Service
public class LoginBiz {

    /**
     * 用户登陆的时候  如果用户名不为空 且密码为123456  则登陆成功
     *
     * @param userName
     * @param password
     */
    public Boolean login(String userName, String password) {
        boolean flag = false;

        // 用户信息验证
        if (StringUtils.isNotBlank(userName) && "123456".equals(password)) {
            flag = true;
        }
        return flag;
    }
}
