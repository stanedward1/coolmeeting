package org.longbiu.meeting.service;

import org.longbiu.meeting.mapper.EmployeeMapper;
import org.longbiu.meeting.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname EmployeeService
 * @Description TODO
 * @Date 2021/1/23 14:10
 * @Author LongBiu
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    public Employee doLogin(String username,String password){
        Employee employee = employeeMapper.loadEmByUsername(username);
        if(employee == null||!employee.getPassword().equals(password)){
            return null;
        }
        return employee;
    }

    public Integer doReg(Employee employee) {
        Employee emp = employeeMapper.loadEmByUsername(employee.getUsername());
        if(emp!=null){
            return -1;
        }
        employee.setRole(1);
        employee.setStatus(0);
        return employeeMapper.doReg(employee);
    }
}
