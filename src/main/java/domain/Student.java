package domain;

import java.util.Date;

public class Student {
    private String stu_id;      //学生ID
    private String stu_name;    //学生姓名
    private String stu_gender;  //学生性别
    private Date stu_birthday;  //出生日期
    private Integer stu_age;    //年龄
    private String stu_tel;     //学生电话
    private String stu_identity;//身份证号
    private String stu_nativeplace;//籍贯
    private String stu_level;   //驾照等级
    private Date stu_createtime;//报名时间
    private String stu_photo;   //学生照片
    private Integer stu_effective;//是否有效 0 1
    private Exam stu_exam_id;   //预约考试

    /**
     * 通过orm方式表示,多个学生对应一个班级
     * private Integer stu_class_type;//班级类型
     * 通过orm方式表示,多个学生对应一个教练
     * private String stu_teacher_name;//教练姓名
     * 多个学生对应一个进度
     * private String stu_schedule_info;//进度信息
     */
    private Class stu_class_type;
    private Teacher stu_teacher_name;
    private Schedule stu_schedule_info;

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

    public String getStu_gender() {
        return stu_gender;
    }

    public void setStu_gender(String stu_gender) {
        this.stu_gender = stu_gender;
    }

    public Date getStu_birthday() {
        return stu_birthday;
    }

    public void setStu_birthday(Date stu_birthday) {
        this.stu_birthday = stu_birthday;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public void setStu_age(Integer stu_age) {
        this.stu_age = stu_age;
    }

    public String getStu_tel() {
        return stu_tel;
    }

    public void setStu_tel(String stu_tel) {
        this.stu_tel = stu_tel;
    }

    public String getStu_identity() {
        return stu_identity;
    }

    public void setStu_identity(String stu_identity) {
        this.stu_identity = stu_identity;
    }

    public String getStu_nativeplace() {
        return stu_nativeplace;
    }

    public void setStu_nativeplace(String stu_nativeplace) {
        this.stu_nativeplace = stu_nativeplace;
    }

    public String getStu_level() {
        return stu_level;
    }

    public void setStu_level(String stu_level) {
        this.stu_level = stu_level;
    }

    public Date getStu_createtime() {
        return stu_createtime;
    }

    public void setStu_createtime(Date stu_createtime) {
        this.stu_createtime = stu_createtime;
    }

    public String getStu_photo() {
        return stu_photo;
    }

    public void setStu_photo(String stu_photo) {
        this.stu_photo = stu_photo;
    }

    public Integer getStu_effective() {
        return stu_effective;
    }

    public void setStu_effective(Integer stu_effective) {
        this.stu_effective = stu_effective;
    }

    public Class getStu_class_type() {
        return stu_class_type;
    }

    public void setStu_class_type(Class stu_class_type) {
        this.stu_class_type = stu_class_type;
    }

    public Teacher getStu_teacher_name() {
        return stu_teacher_name;
    }

    public void setStu_teacher_name(Teacher stu_teacher_name) {
        this.stu_teacher_name = stu_teacher_name;
    }

    public Schedule getStu_schedule_info() {
        return stu_schedule_info;
    }

    public void setStu_schedule_info(Schedule stu_schedule_info) {
        this.stu_schedule_info = stu_schedule_info;
    }

    public Exam getStu_exam_id() {
        return stu_exam_id;
    }

    public void setStu_exam_id(Exam stu_exam_id) {
        this.stu_exam_id = stu_exam_id;
    }
}
