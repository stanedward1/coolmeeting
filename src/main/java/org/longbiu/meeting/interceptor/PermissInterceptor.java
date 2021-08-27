package org.longbiu.meeting.interceptor;

import org.longbiu.meeting.model.Employee;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Classname PermissInterceptor
 * @Description TODO
 * @Date 2021/2/14 0:38
 * @Author longbiu
 */
public class PermissInterceptor implements HandlerInterceptor {
    AntPathMatcher pathMatcher = new AntPathMatcher();

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        //  这些界面匿名就可以访问
        if("/".equals(requestURI)||"/doLogin".equals(requestURI)||"/register".equals(requestURI)||"/doReg".equals(requestURI)){
            return true;
        }
        HttpSession session = request.getSession(true);
        Employee currentuser = (Employee) session.getAttribute("currentuser");
        if (pathMatcher.match("/admin/**", requestURI)) {
            if (currentuser !=null) {
                if (currentuser.getRole() == 2) {
                    return true;
                }else {
                    response.getWriter().write("forbidden");
                    return false;
                }
            }
        } else {
            if (currentuser != null) {
                return true;
            }
        }
        response.sendRedirect("/");
        return false;
    }
}
