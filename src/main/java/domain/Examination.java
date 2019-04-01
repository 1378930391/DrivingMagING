package domain;

import java.util.Date;

/**
 * `source_id` varchar(255) NOT NULL,
 `subject1_time` datetime DEFAULT NULL,
 `subject1_source` int(4) DEFAULT NULL,
 `subject2_time` datetime DEFAULT NULL,
 `subject2_source` int(4) DEFAULT NULL,
 `subject3_time` datetime DEFAULT NULL,
 `subject3_source` int(4) DEFAULT NULL,
 `subject4_time` datetime DEFAULT NULL,
 `subject4_source` int(4) DEFAULT NULL,
 */
public class Examination {
    private String source_id;
    private Date   subject1_time;
    private Integer subject1_source;
    private Date   subject2_time;
    private Integer subject2_source;
    private Date   subject3_time;
    private Integer subject3_source;
    private Date   subject4_time;
    private Integer subject4_source;
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSource_id() {
        return source_id;
    }

    public void setSource_id(String source_id) {
        this.source_id = source_id;
    }

    public Date getSubject1_time() {
        return subject1_time;
    }

    public void setSubject1_time(Date subject1_time) {
        this.subject1_time = subject1_time;
    }

    public Integer getSubject1_source() {
        return subject1_source;
    }

    public void setSubject1_source(Integer subject1_source) {
        this.subject1_source = subject1_source;
    }

    public Date getSubject2_time() {
        return subject2_time;
    }

    public void setSubject2_time(Date subject2_time) {
        this.subject2_time = subject2_time;
    }

    public Integer getSubject2_source() {
        return subject2_source;
    }

    public void setSubject2_source(Integer subject2_source) {
        this.subject2_source = subject2_source;
    }

    public Date getSubject3_time() {
        return subject3_time;
    }

    public void setSubject3_time(Date subject3_time) {
        this.subject3_time = subject3_time;
    }

    public Integer getSubject3_source() {
        return subject3_source;
    }

    public void setSubject3_source(Integer subject3_source) {
        this.subject3_source = subject3_source;
    }

    public Date getSubject4_time() {
        return subject4_time;
    }

    public void setSubject4_time(Date subject4_time) {
        this.subject4_time = subject4_time;
    }

    public Integer getSubject4_source() {
        return subject4_source;
    }

    public void setSubject4_source(Integer subject4_source) {
        this.subject4_source = subject4_source;
    }
}
