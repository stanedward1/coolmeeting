package org.longbiu.meeting.mapper;

import org.longbiu.meeting.model.Department;

/**
 * @Classname DepartmentMapper
 * @Description TODO
 * @Date 2021/1/22 13:47
 * @Author LongBiu
 */
public interface DepartmentMapper {
    Department getDepById(Integer id);
}
