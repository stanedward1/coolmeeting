package org.longbiu.meeting.controller;

import org.longbiu.meeting.model.Department;
import org.longbiu.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DepartmentController
 * @Description TODO
 * @Date 2021/1/22 13:49
 * @Author Longbiu
 */
@Controller
@RequestMapping("/admin")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @RequestMapping("/departments")
    public String departments(Model model) {
        model.addAttribute("deps",departmentService.getAllDeps());
        return "departments";
    }

    @RequestMapping("/adddepartment")
    public String addDepartment(String departmentname){
        departmentService.adddepartment(departmentname);
        return "redirect:/admin/departments";
    }

    @RequestMapping("/deletedep")
    public String deletedep(Integer departmentid){
        departmentService.deletedep(departmentid);
        return "redirect:/admin/departments";
    }
}
