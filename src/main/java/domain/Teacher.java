package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * `teacher_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
 `teacher_name` varchar(255) NOT NULL,
 `teacher_tel` varchar(12) NOT NULL,
 `teacher_carnumber` varchar(12) NOT NULL,  教练车牌号
 `teacher_carcode` int(4) NOT NULL,         教练车号
 `teacher_gender` varchar(3) NOT NULL,
 `teacher_salary` double(10,2) NOT NULL,
 `teacher_department_id` int(2) NOT NULL,
 `teacher_student_id` varchar(255) DEFAULT NULL,
 */
public class Teacher {
    private String teacher_id;
    private String teacher_name;
    private String teacher_tel;
    private String teacher_carnumber;
    private String teacher_carcode;
    private String teacher_gender;
    private Double teacher_salary;
    //配置教练和部门的映射
    private Department department;
    //private Integer teacher_department_id;

    //配置教练有多个学生
    private Set<Student> students = new HashSet<Student>();

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_tel() {
        return teacher_tel;
    }

    public void setTeacher_tel(String teacher_tel) {
        this.teacher_tel = teacher_tel;
    }

    public String getTeacher_carnumber() {
        return teacher_carnumber;
    }

    public void setTeacher_carnumber(String teacher_carnumber) {
        this.teacher_carnumber = teacher_carnumber;
    }

    public String getTeacher_carcode() {
        return teacher_carcode;
    }

    public void setTeacher_carcode(String teacher_carcode) {
        this.teacher_carcode = teacher_carcode;
    }

    public String getTeacher_gender() {
        return teacher_gender;
    }

    public void setTeacher_gender(String teacher_gender) {
        this.teacher_gender = teacher_gender;
    }

    public Double getTeacher_salary() {
        return teacher_salary;
    }

    public void setTeacher_salary(Double teacher_salary) {
        this.teacher_salary = teacher_salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
