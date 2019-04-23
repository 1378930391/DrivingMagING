package service;

import domain.Class;

import java.util.List;

public interface ClassService {
    List<Class> findAll();
    List<Class> findAllClass();
    Class findOne(Integer class_id);
    void updateClass(Class clazz);
}
