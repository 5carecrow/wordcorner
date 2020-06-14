package com.lanchaohao.wordcorner.config;

import com.lanchaohao.wordcorner.domain.Users;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by Admin
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag =true;
         //用户拦截
        Users user=(Users)request.getSession().getAttribute("login_user");
        if(null==user){
            System.out.println("拦截来源:"+request.getRequestURI()+"时间:"+new Date(System.currentTimeMillis()));
            response.sendRedirect("/login");
            flag = false;
        }else{
            flag = true;
        }
        //管理员拦截
//        Users admin=(Users)request.getSession().getAttribute("admin_user");
//        if(null==user){
//            response.sendRedirect("toLogin");
//            flag = false;
//        }else{
//            flag = true;
//        }

        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
