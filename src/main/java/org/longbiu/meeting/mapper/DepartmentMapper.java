package org.longbiu.meeting.mapper;

import org.longbiu.meeting.model.Department;

import java.util.List;

/**
 * @Classname DepartmentMapper
 * @Description TODO
 * @Date 2021/1/22 13:47
 * @Author LongBiu
 */
public interface DepartmentMapper {
    Department getDepById(Integer id);

    List<Department> getAllDeps();

    Integer adddepartment(String departmentname);

    Department getDepByName(String departmentname);

    Integer deletedep(Integer departmentid);
}
