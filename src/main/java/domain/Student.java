package domain;

import java.util.Date;

/**
 * 存储驾校学生的基本信息
 * `stu_id` varchar(255) NOT NULL,      学生id
 `stu_name` varchar(255) NOT NULL,      学生姓名
 `stu_tel` varchar(15) NOT NULL,        学生电话
 `stu_cartype` varchar(10) NOT NULL,    驾照类型
 `stu_teacher_id` varchar(255) DEFAULT NULL,    教练员
 `stu_createtime` datetime NOT NULL,    入学时间
 `stu_source_id` varchar(255) NOT NULL, 成绩状况
 */
public class Student {
    private String stu_id;
    private String stu_name;
    private String stu_tel;
    private String stu_cartype;
    private Date   stu_createtime;
    //private String stu_teacher_id;
    //一个学生只能属于一个老师
    private Teacher teacher;


    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_tel() {
        return stu_tel;
    }

    public void setStu_tel(String stu_tel) {
        this.stu_tel = stu_tel;
    }

    public String getStu_cartype() {
        return stu_cartype;
    }

    public void setStu_cartype(String stu_cartype) {
        this.stu_cartype = stu_cartype;
    }

    public Date getStu_createtime() {
        return stu_createtime;
    }

    public void setStu_createtime(Date stu_createtime) {
        this.stu_createtime = stu_createtime;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
