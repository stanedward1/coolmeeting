package org.longbiu.meeting.model;

/**
 * @Classname Department
 * @Description TODO
 * @Date 2021/1/22 13:45
 * @Author LongBiu
 */
public class Department {
    private Integer departmentid;
    private String departmentname;

    @Override
    public String toString() {
        return "Department{" +
                "departmentid=" + departmentid +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }
}
