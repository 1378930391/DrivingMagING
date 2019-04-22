package service;

import dao.ClassDao;
import domain.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/22 8:34
 * @version: v1.0.0
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Resource(name = "classDao")
    private ClassDao classDao;


    @Override
    public List<Class> findAllClass() {
        return classDao.findAll();
    }

    @Override
    public Class findOne(Integer class_id) {
        return classDao.findById(class_id);
    }

    @Override
    public void updateClass(Class clazz) {
        classDao.update(clazz);
    }
}
