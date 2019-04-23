package vo;

import java.util.Date;

public class ExamVo {
    private Integer exam_id;
    private String exam_date;
    private String exam_subject;
    private Integer exam_currPeople;
    private Integer exam_maxPeople;
    private String exam_room;

    public Integer getExam_id() {
        return exam_id;
    }

    public void setExam_id(Integer exam_id) {
        this.exam_id = exam_id;
    }

    public String getExam_date() {
        return exam_date;
    }

    public void setExam_date(String exam_date) {
        this.exam_date = exam_date;
    }

    public String getExam_subject() {
        return exam_subject;
    }

    public void setExam_subject(String exam_subject) {
        this.exam_subject = exam_subject;
    }

    public Integer getExam_currPeople() {
        return exam_currPeople;
    }

    public void setExam_currPeople(Integer exam_currPeople) {
        this.exam_currPeople = exam_currPeople;
    }

    public Integer getExam_maxPeople() {
        return exam_maxPeople;
    }

    public void setExam_maxPeople(Integer exam_maxPeople) {
        this.exam_maxPeople = exam_maxPeople;
    }

    public String getExam_room() {
        return exam_room;
    }

    public void setExam_room(String exam_room) {
        this.exam_room = exam_room;
    }
}
