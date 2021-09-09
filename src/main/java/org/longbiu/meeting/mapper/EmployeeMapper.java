package org.longbiu.meeting.mapper;

import org.apache.ibatis.annotations.Param;
import org.longbiu.meeting.model.Employee;

import java.util.List;

/**
 * @Classname EmployeeMapper
 * @Description TODO
 * @Date 2021/1/23 14:08
 * @Author longbiu
 */
public interface EmployeeMapper {
    Employee loadEmByUsername(String username);

    Integer doReg(Employee employee);

    List<Employee> getAllEmpsByStatus(Integer status);

    Integer approveaccount(@Param("employeeid") Integer employeeid, @Param("status") Integer status);

    List<Employee> getAllEmps(@Param("emp") Employee employee, @Param("page") Integer page, @Param("pagesize") Integer pageSize);

    Long getTotal(Employee employee);

    List<Employee> getEmpsByDepId(Integer depId);
}
