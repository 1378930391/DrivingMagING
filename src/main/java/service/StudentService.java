package service;

import domain.Student;

import java.util.List;

public interface StudentService {
    public Student findStudent(String stu_id);

    void save(Student student);

    void update(Student student);

    List<Student> findAll();
}
