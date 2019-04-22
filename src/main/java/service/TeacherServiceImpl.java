package service;

import dao.TeacherDao;
import domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public void update(Teacher teacher) {
        teacherDao.update(teacher);
    }

    @Override
    public void insert(Teacher teacher) {
        teacherDao.save(teacher);
    }
}
