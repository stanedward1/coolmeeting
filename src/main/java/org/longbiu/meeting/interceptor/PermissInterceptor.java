package org.longbiu.meeting.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname PermissInterceptor
 * @Description TODO
 * @Date 2021/2/14 0:38
 * @Author LongBiu
 */
public class PermissInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        if("/".equals(requestURI)||"/doLogin".equals(requestURI)||"/register".equals(requestURI)||"/doReg".equals(requestURI)){
            return true;
        }
        return false;
    }
}
