package service;

import dao.ClazzDao;
import domain.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClazzDao clazzDao;
    @Override
    public List<Class> findAll() {
        List<Class> list = clazzDao.findAll();
        return list;
    }
}
