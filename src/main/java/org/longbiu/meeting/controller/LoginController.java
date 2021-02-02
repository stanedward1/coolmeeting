package org.longbiu.meeting.controller;

import org.longbiu.meeting.model.Department;
import org.longbiu.meeting.model.Employee;
import org.longbiu.meeting.service.DepartmentService;
import org.longbiu.meeting.service.EmployeeService;
import org.longbiu.meeting.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

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

    @Autowired
    DepartmentService departmentService;

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

    @RequestMapping("/register")
    public String register(Model model){
        List<Department> deps =  departmentService.getAllDeps();
        model.addAttribute("deps",deps);
        return "register";
    }

    @RequestMapping("/doReg")
    public String doReg(Employee employee,Model model){
        Integer result = employeeService.doReg(employee);
        if (result == 1) {
            return "redirect:/";
        }else{
            model.addAttribute("error","注册失败");
            model.addAttribute("employee",employee);
            return "forward:/register";
        }
    }
}
