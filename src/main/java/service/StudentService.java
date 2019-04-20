package service;

import domain.Student;

public interface StudentService {
    public Student findStudent(String stu_id);

    void save(Student student);

    void update(Student student);
}
