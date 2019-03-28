package domain;

/**
 * 将其他员工信息存储在这个类中
 * `staff_id` varchar(255) NOT NULL,
 `staff_name` varchar(255) NOT NULL,
 `staff_gender` varchar(4) NOT NULL,
 `staff_salary` double(10,2) NOT NULL,
 `staff_tel` varchar(15) NOT NULL,
 `staff_department_id` int(4) NOT NULL,
 */
public class Staff {
    private String staff_id;
    private String staff_name;
    private String staff_gender;
    private String staff_salary;
    private String staff_tel;
    //一个员工对应一个职位
    private Department department;
    //private String staff_department_id;

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_gender() {
        return staff_gender;
    }

    public void setStaff_gender(String staff_gender) {
        this.staff_gender = staff_gender;
    }

    public String getStaff_salary() {
        return staff_salary;
    }

    public void setStaff_salary(String staff_salary) {
        this.staff_salary = staff_salary;
    }

    public String getStaff_tel() {
        return staff_tel;
    }

    public void setStaff_tel(String staff_tel) {
        this.staff_tel = staff_tel;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
