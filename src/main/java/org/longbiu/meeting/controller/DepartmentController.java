package org.longbiu.meeting.controller;

import org.longbiu.meeting.model.Department;
import org.longbiu.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/departments")
    public String departments() {
        return "departments";
    }
}
