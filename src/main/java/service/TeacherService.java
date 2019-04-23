package service;

import domain.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAll();
    void update(Teacher teacher);

    void insert(Teacher teacher);

    Teacher findById(Integer teaher_id);

    void delete(Teacher newT);
}
