package service;
import dao.TeacherDao;
import domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    public List<Teacher> findAll(){
        List<Teacher> list = teacherDao.findAll();
        return list;
    }
}
