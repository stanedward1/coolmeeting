package org.longbiu.meeting.controller;

import org.longbiu.meeting.model.Department;
import org.longbiu.meeting.model.Employee;
import org.longbiu.meeting.service.DepartmentService;
import org.longbiu.meeting.service.EmployeeService;
import org.longbiu.meeting.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
;

import java.util.List;

/**
 * @Classname MeetingController
 * @Description 会议管理
 * @Date 2021/8/28 16:33
 * @Author Longbiu
 */
@Controller
public class MeetingController {
    @Autowired
    MeetingRoomService meetingRoomService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/bookmeeting")
    public String bookmeeting(Model model) {
        model.addAttribute("mrs", meetingRoomService.getAllMr());
        return "bookmeeting";
    }

    @RequestMapping(value = "/alldeps")
    @ResponseBody
    public List<Department> getAllDeps() {
        return departmentService.getAllDeps();
    }

    @ResponseBody
    @RequestMapping("/getempbydepid")
    public List<Employee> getEmpsByDepId(Integer depId) {
        return employeeService.getEmpsByDepId(depId);
    }
}
