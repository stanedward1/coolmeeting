package org.longbiu.meeting.controller;

import org.longbiu.meeting.model.Employee;
import org.longbiu.meeting.service.EmployeeService;
import org.longbiu.meeting.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Classname LoginController
 * @Description TODO
 * @Date 2021/1/23 13:51
 * @Author LongBiu
 */
@Controller
public class LoginController {

    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(String username, String password, Model model, HttpSession httpSession) {
        Employee employee = employeeService.doLogin(username, password);
        if (employee == null) {
            model.addAttribute("error", "用户名或密码输入错误，登录失败");
            return "forward:/";
        }else{
            if (employee.getStatus() == 0) {
                model.addAttribute("error", "用户待审批");
                return "forward:/";
            }else if (employee.getStatus() == 2) {
                model.addAttribute("error", "用户审批未通过");
                return "forward:/";
            }else{
                httpSession.setAttribute("currentuser", employee);
                return "redirect:/notifications";
            }
        }
    }
}