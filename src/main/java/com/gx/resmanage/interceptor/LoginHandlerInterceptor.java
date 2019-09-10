package com.gx.resmanage.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 添加登陆拦截器
 *
 * @author gaoxu
 * @date 2019-09-06 10:32
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    /**
     * 目标方法执行之前
     *
     * @param request  请求
     * @param response
     * @param handler
     * @return
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {

        Object loginUser = request.getSession().getAttribute("loginUser");

        if (loginUser == null) {
            // 如果未登录 则直接抛出异常 并返回未登录界面

            request.setAttribute("msg", "用户没有登陆");
            request.getRequestDispatcher("index,html").forward(request, response);
            return false;
        }

        // 如果为登陆状态 则放行

        return true;
    }
}
