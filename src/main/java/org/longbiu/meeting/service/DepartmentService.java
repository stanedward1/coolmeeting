package org.longbiu.meeting.service;

import org.longbiu.meeting.mapper.DepartmentMapper;
import org.longbiu.meeting.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname DepartmentService
 * @Description TODO
 * @Date 2021/1/22 13:47
 * @Author LongBiu
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public Department getDepById(Integer id) {
        return departmentMapper.getDepById(id);
    }

    public List<Department> getAllDeps() {
        return departmentMapper.getAllDeps();
    }
}

