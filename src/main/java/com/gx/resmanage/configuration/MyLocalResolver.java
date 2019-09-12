package com.gx.resmanage.configuration;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 本地国际化解析器
 *
 * @author gaoxu
 * @date 2019-09-11 14:06
 */
public class MyLocalResolver implements LocaleResolver {


    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        String l = request.getParameter("l");

        // 获取到默认
        Locale locale = Locale.getDefault();

        if (!StringUtils.isEmpty(l)) {
            String[] split = l.split("_");
            // 传递两个参数 语言  和区域
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }


    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
