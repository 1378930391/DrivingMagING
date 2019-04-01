package domain;

/**
 * 这个类中记录驾校的部门信息
 * `department_id` int(4) NOT NULL AUTO_INCREMENT,  部门id
 * `department_name` varchar(255) NOT NULL,         部门名称
 */
public class Department {
    private Integer department_id;
    private String department_name;

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
}
