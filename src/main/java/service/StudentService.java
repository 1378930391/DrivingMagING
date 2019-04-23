package service;

import domain.Exam;
import domain.Student;

import java.util.List;

public interface StudentService {
    Boolean orderExam(Student student, int stu_exam_id);

    List<Student> findAll();

    void insert(Student student);

    void update(Student student);

    Student findById(String stu_id);
}
