package service;

import domain.Class;

import java.util.List;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/22 8:34
 * @version: v1.0.0
 */
public interface ClassService {
    List<Class> findAllClass();
    Class findOne(Integer class_id);
    void updateClass(Class clazz);
}
