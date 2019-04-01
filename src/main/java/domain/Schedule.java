package domain;

import java.util.Date;

/**
 * 教练和学生练车的时间表
 * `schedule_id` int(10) NOT NULL AUTO_INCREMENT,
 * `schedule_starttime` datetime NOT NULL,
 * `schedule_endtime` datetime NOT NULL,
 * `schedule_teacher_id` varchar(255) NOT NULL,
 * `schedule_student_id` varchar(255) DEFAULT NULL,
 *
 */
public class Schedule {
    private Integer schedule_id;
    private Date schedule_starttime;
    private Date schedule_endtime;
    //教练教学的对象
    private Teacher teacher;
    //学生学车的对象
    private Student student;
    //private String schedule_teacher_id;
    //private String schedule_student_id;

    public Integer getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(Integer schedule_id) {
        this.schedule_id = schedule_id;
    }

    public Date getSchedule_starttime() {
        return schedule_starttime;
    }

    public void setSchedule_starttime(Date schedule_starttime) {
        this.schedule_starttime = schedule_starttime;
    }

    public Date getSchedule_endtime() {
        return schedule_endtime;
    }

    public void setSchedule_endtime(Date schedule_endtime) {
        this.schedule_endtime = schedule_endtime;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
