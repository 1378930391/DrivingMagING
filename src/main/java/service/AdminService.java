package service;

import domain.Admin;
import domain.Student;

import java.util.List;
import java.util.Map;


public interface AdminService {
    Admin login(Admin admin);

    Map<String, Integer> getIncome();
    Map<String, List<Student>> getAllStudentByClass();
    Map<String, List<Student>> getAllStudentByTeacher();
}
