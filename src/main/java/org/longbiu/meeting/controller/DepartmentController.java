package org.longbiu.meeting.controller;

import org.longbiu.meeting.model.Department;
import org.longbiu.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DepartmentController
 * @Description TODO
 * @Date 2021/1/22 13:49
 * @Author LongBiu
 */
@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/dep")
    public void gerDepById(Integer id){
        Department dep = departmentService.getDepById(id);
        System.out.println("dep= "+dep);
    }
}
