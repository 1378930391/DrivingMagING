package service;
import domain.Student;
import java.util.*;


public interface StudentService {
    boolean login(Student student);
     Student findStudent(String stu_id);

    void save(Student student);

    void update(Student student);

    List<Student> findAll();
}
