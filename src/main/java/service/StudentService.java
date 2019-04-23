package service;

import domain.Student;
import org.springframework.stereotype.Service;

import java.util.*;

public interface StudentService {
    Boolean orderExam(Student student, int stu_exam_id);

    List<Student> findAll();

    void insert(Student student);

    Student findById(String stu_id);

    Student login(Student student);

    Student findStudent(String stu_id);

    void save(Student student);

    void update(Student student);

}
