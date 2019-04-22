package domain;

public class Teacher {
    private Integer teacher_id;
    private String teacher_name;
    private String teacher_tel;
    private String teacher_gender;
    private Integer teacher_carId;
    private String teacher_department;
    private String teacher_level;
    private String teacher_photo;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", teacher_name='" + teacher_name + '\'' +
                ", teacher_tel='" + teacher_tel + '\'' +
                ", teacher_gender='" + teacher_gender + '\'' +
                ", teacher_carId=" + teacher_carId +
                ", teacher_department='" + teacher_department + '\'' +
                ", teacher_level='" + teacher_level + '\'' +
                ", teacher_photo='" + teacher_photo + '\'' +
                '}';
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
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

    public String getTeacher_gender() {
        return teacher_gender;
    }

    public void setTeacher_gender(String teacher_gender) {
        this.teacher_gender = teacher_gender;
    }

    public Integer getTeacher_carId() {
        return teacher_carId;
    }

    public void setTeacher_carId(Integer teacher_carId) {
        this.teacher_carId = teacher_carId;
    }

    public String getTeacher_department() {
        return teacher_department;
    }

    public void setTeacher_department(String teacher_department) {
        this.teacher_department = teacher_department;
    }

    public String getTeacher_level() {
        return teacher_level;
    }

    public void setTeacher_level(String teacher_level) {
        this.teacher_level = teacher_level;
    }

    public String getTeacher_photo() {
        return teacher_photo;
    }

    public void setTeacher_photo(String teacher_photo) {
        this.teacher_photo = teacher_photo;
    }
}
