package org.longbiu.meeting.mapper;

import org.longbiu.meeting.model.Employee;

/**
 * @Classname EmployeeMapper
 * @Description TODO
 * @Date 2021/1/23 14:08
 * @Author LongBiu
 */
public interface EmployeeMapper {
    Employee loadEmByUsername(String username);

    Integer doReg(Employee employee);
}
