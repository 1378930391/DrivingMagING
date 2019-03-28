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
}
